package com.ironhack.introtojpa.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

    public class Flight {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer flightId;

        private String flightNumber;

        private String aircraft;

        private Integer totalAircraftSeats;

        private Integer flightMileage;

}
