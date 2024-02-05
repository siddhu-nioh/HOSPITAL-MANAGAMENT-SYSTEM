package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.modal.BloodDonor;
import com.app.repository.BloodDonorRepository;
import com.app.service.intf.BloodDonorIntf;

@RestController
@RequestMapping("/blood_donation")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class BloodDonorController {

    @Autowired
    private BloodDonorIntf bloodDonorService;

    @GetMapping("/search/{city}/{bloodGroup}")
    public List<BloodDonor> getAllBloodDonorsByCityAndBloodGroup(@PathVariable String city,
            @PathVariable String bloodGroup) {
        return bloodDonorService.getAllBloodDonorsByCityAndBloodGroup(city, bloodGroup);
    }

    /* @PostMapping("/create")
    public ResponseEntity<BloodDonor> saveDonor(@RequestBody BloodDonor bloodDonor) {
        BloodDonor savedDonor = BloodDonorRepository.saveDonor(bloodDonor);
        return new ResponseEntity<>(savedDonor, HttpStatus.CREATED);
    } */
}


