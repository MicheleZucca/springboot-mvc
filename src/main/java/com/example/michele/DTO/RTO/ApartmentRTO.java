package com.example.michele.DTO.RTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApartmentRTO {

    private Long id;
    private String name;
    private String city;
    private Integer houseNmber;
    private String streetName;

    public ApartmentRTO(Long id, String name, String city, Integer houseNmber, String streetName) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.houseNmber = houseNmber;
        this.streetName = streetName;
    }
}
