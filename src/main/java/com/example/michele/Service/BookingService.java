package com.example.michele.Service;

import com.example.michele.DTO.RTO.BookingRTO;
import com.example.michele.DTO.TO.BookingTO;
import com.example.michele.Entity.Booking;
import com.example.michele.Repository.ApartementRepository;
import com.example.michele.Repository.BookingRepository;
import com.example.michele.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    ApartementRepository apartementRepository;
    @Autowired
    UserRepository userRepository;
    public Long addNewBooking(BookingTO bookingTO){
        Booking newBooking = new Booking();
        newBooking.setApartment(apartementRepository.getById(bookingTO.getApartement().getId()));
        newBooking.setUser(userRepository.getById(bookingTO.getUser().getId()));
        newBooking.setCheckinDate(bookingTO.getCheckinDate());
        if (bookingTO.getCheckoutDate() != null){
            newBooking.setCheckoutDate(bookingTO.getCheckoutDate());
        }
        return bookingRepository.save(newBooking).getId();
    }

    public List<BookingRTO> getAllBooking(){
        return bookingRepository.getAllBooking();
    }

    public List<BookingRTO> getAllWithoutCheckout(){
        return bookingRepository.getAllWithoutCheckout();
    }
}
