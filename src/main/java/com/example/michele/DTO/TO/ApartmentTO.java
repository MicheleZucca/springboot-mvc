package com.example.michele.DTO.TO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApartmentTO {
    private String name;
    private String city;
    private Integer houseNumber;
    private String streetName;
}
