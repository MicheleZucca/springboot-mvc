package com.example.michele.DTO.RTO;

import com.example.michele.DTO.BaseDataDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.ParseException;
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
    private Date checkinDate;
    private Date checkoutDate;

    public BookingRTO(Long booking, Long apartmentId, String apartement, Long userId, String user, String checkinDate, String checkoutDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.booking = booking;
        this.apartement = new BaseDataDTO(apartmentId, apartement);
        this.userId = userId;
        this.user = new BaseDataDTO(userId, user);

        try {
            this.checkinDate = dateFormat.parse(checkinDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try {
            this.checkoutDate = (checkoutDate != null) ? dateFormat.parse(checkoutDate) : null;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
