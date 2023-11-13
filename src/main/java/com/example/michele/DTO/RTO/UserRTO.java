package com.example.michele.DTO.RTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRTO {
    private Long id;
    private String name;
    private String surname;
    private String email;
}
