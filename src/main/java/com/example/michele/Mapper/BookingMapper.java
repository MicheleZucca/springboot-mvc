package com.example.michele.Mapper;

import com.example.michele.DTO.RTO.BookingRTO;
import com.example.michele.Entity.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring", uses = {})
public interface BookingMapper {
    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    @Mapping(target = "booking", source = "id")
    BookingRTO bookingRtoFromBookingEntity(Booking booking);

    List<BookingRTO> bookingRtoListFromBookingEntityList(List<Booking> bookings);
}
