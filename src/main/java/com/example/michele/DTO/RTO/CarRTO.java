package com.example.michele.DTO.RTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarRTO {

    private Long id;
    private String targa;
    private String modello;
}
