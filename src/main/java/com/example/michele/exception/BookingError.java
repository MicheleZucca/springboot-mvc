package com.example.michele.exception;

import com.example.michele.DTO.TO.BookingTO;
import org.springframework.stereotype.Component;

@Component
public class BookingError extends RuntimeException{


    public void BookingDataException(BookingTO bookingTO){
        if(bookingTO.getCheckinDate() == null){
            throw new Error("Insert checkin date!");
        } else if (bookingTO.getApartement().getId() == null) {
            throw new Error("Insert apartement id!");
        } else if (bookingTO.getUser().getId() == null) {
            throw new Error("Insert user id!");
        }
        if (bookingTO.getCheckinDate() != null && bookingTO.getCheckoutDate() != null){
            if (!bookingTO.getCheckinDate().before(bookingTO.getCheckoutDate())){
                throw new Error("La data di checkout deve essere successiva a quella di checkin!");
            }
        }
    }
}
