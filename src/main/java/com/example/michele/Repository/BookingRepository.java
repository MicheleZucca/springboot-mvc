package com.example.michele.Repository;

import com.example.michele.DTO.RTO.BookingRTO;
import com.example.michele.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query("select new com.example.michele.DTO.RTO.BookingRTO(b.id, a.id, a.name, u.id, u.name, b.checkinDate, b.checkoutDate) " +
            "from Booking b, Apartment a, User u ")
    List<BookingRTO> getAllBooking();

    @Query("select b from Booking b " +
            "where b.checkoutDate is not null")
    List<BookingRTO> getAllWithoutCheckout();
}
