package com.example.michele.DTO.RTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRTO {
    private Long id;
    private String name;
    private String surname;
    private String email;

    public UserRTO(Long id, String name, String surname, String email){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = (email != null) ? email : " ";
    }
}
