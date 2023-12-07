package com.example.michele.controller;

import com.example.michele.DTO.RTO.BookingRTO;
import com.example.michele.DTO.TO.BookingTO;
import com.example.michele.Service.BookingService;
import com.example.michele.exception.BookingError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @Autowired
    BookingError bookingError;

    @PostMapping(path = "/add-new-booking")
    public ResponseEntity<Long> addNewBooking(@RequestBody BookingTO bookingTO){
        bookingError.BookingDataException(bookingTO);
        return new ResponseEntity<>(bookingService.addNewBooking(bookingTO), HttpStatus.OK);
    }

    @GetMapping(path = "/get-all-booking")
    public ResponseEntity<List<BookingRTO>> getAllBooking(){
        return new ResponseEntity<>(bookingService.getAllBooking(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-all-booking-without-checkout")
    public ResponseEntity<List<BookingRTO>> getAllBookingWithOutCheckout(){
        return new ResponseEntity<>(bookingService.getAllWithoutCheckout(), HttpStatus.OK);
    }
}
