package com.example.michele.controller;

import com.example.michele.DTO.TO.ApartmentTO;
import com.example.michele.Service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apartemnt")
public class ApartementController {

    @Autowired
    ApartmentService apartmentService;

    @PostMapping(path = "/add-new-apartment")
    public ResponseEntity<Long> addNewApartemtn(@RequestBody ApartmentTO apartmentTO){
        return new ResponseEntity<>(apartmentService.addAparment(apartmentTO), HttpStatus.OK);
    }
}
