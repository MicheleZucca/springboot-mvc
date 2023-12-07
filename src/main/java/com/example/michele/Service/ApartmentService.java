package com.example.michele.Service;

import com.example.michele.DTO.TO.ApartmentTO;
import com.example.michele.Entity.Apartment;
import com.example.michele.Repository.ApartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentService {
    @Autowired
    ApartementRepository apartementRepository;

    public Long addAparment(ApartmentTO apartmentTO){
        Apartment newApartment = new Apartment();
        newApartment.setCity(apartmentTO.getCity());
        newApartment.setStreetName(apartmentTO.getStreetName());
        newApartment.setName(apartmentTO.getName());
        newApartment.setHouseNumber(apartmentTO.getHouseNumber());
        return apartementRepository.save(newApartment).getId();
    }

}
