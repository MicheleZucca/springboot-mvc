package com.example.michele.DTO.TO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTO {
    private String name;
    private String surname;
    private String email;
}
