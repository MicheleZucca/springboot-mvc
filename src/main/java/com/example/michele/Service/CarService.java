package com.example.michele.Service;

import com.example.michele.DTO.TO.CarTO;
import com.example.michele.Entity.Car;
import com.example.michele.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public Long newCar(CarTO car){
        Car newCar = new Car();
        newCar.setModel(car.getModel());
        newCar.setTarga(car.getTarga());
        return carRepository.save(newCar).getId();
    }

}
