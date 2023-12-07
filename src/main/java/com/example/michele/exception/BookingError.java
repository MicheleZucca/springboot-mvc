package com.example.michele.exception;

import com.example.michele.DTO.TO.BookingTO;
import org.springframework.stereotype.Component;

@Component
public class BookingError extends RuntimeException{

    public BookingError(String message) {
        super(message);
    }

    public BookingError BookingDataException(BookingTO bookingTO){
        if(bookingTO.getCheckinDate() == null){
            throw new BookingError("Insert checkin date!");
        } else if (bookingTO.getApartement().getId() == null) {
            throw new BookingError("Insert apartement id!");
        } else if (bookingTO.getUser().getId() == null) {
            throw new BookingError("Insert user id!");
        }
        return null;
    }
}
