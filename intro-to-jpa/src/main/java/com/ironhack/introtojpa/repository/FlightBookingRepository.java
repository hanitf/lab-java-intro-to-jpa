package com.ironhack.introtojpa.repository;

import com.ironhack.introtojpa.models.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}
