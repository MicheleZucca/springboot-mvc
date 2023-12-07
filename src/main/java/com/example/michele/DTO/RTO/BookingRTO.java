package com.example.michele.DTO.RTO;

import com.example.michele.DTO.BaseDataDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class BookingRTO {
    private Long booking;
    private Long apartmentId;
    private BaseDataDTO apartement;
    private Long userId;
    private BaseDataDTO user;
    private String checkinDate;
    private String checkoutDate;

    public BookingRTO(Long booking, Long apartmentId, String apartement, Long userId, String user, Date checkinDate, Date checkoutDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.booking = booking;
        this.apartement = new BaseDataDTO(apartmentId, apartement);
        this.userId = userId;
        this.user = new BaseDataDTO(userId, user);
        this.checkinDate = dateFormat.format(checkinDate);
        this.checkoutDate = (checkoutDate != null) ? dateFormat.format(checkoutDate) : null;
    }
}
