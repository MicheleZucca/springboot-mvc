package com.example.michele.controller;

import com.example.michele.DTO.TO.CarTO;
import com.example.michele.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(path = "/create-new-car")
    public ResponseEntity<Long> createNewCar(@RequestBody CarTO carTO){
        return new ResponseEntity<>(carService.newCar(carTO), HttpStatus.OK);
    }
}
