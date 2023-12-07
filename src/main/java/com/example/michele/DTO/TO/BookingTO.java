package com.example.michele.DTO.TO;

import com.example.michele.DTO.BaseDataDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingTO {
    private BaseDataDTO apartement;
    private BaseDataDTO user;
    private Date checkinDate;
    private Date checkoutDate;
}
