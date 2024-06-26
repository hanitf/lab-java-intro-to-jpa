package com.ironhack.introtojpa;

import com.ironhack.introtojpa.models.Flight;
import com.ironhack.introtojpa.repository.FlightRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class FlightRepositoryTests {
    @Autowired
    private FlightRepository flightRepository;

    @Test
    public void testCreateFlight() {
        Flight flight = new Flight("AB123", "Boeing 747", 300, 1000);
        flightRepository.save(flight);
        assertNotNull(flight.getFlightId());
    }

    @Test
    public void testFindFlightByNumber() {
        List<Flight> flights = flightRepository.findByFlightNumber("AB123");
        assertFalse(flights.isEmpty());
    }

    @Test
    public void testFindAircraftContainingBoeing() {
        List<Flight> flights = flightRepository.findByAircraftContaining("Boeing");
        assertFalse(flights.isEmpty());
    }

    @Test
    public void testFindFlightsWithDistanceGreaterThan500Miles() {
        List<Flight> flights = flightRepository.findByFlightMileageGreaterThan(500);
        assertFalse(flights.isEmpty());
    }
}
