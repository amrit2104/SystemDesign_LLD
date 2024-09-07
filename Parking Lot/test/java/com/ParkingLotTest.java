package com.parkinglot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class ParkingLotTest {
    private ParkingLot parkingLot;

    @BeforeEach
    void setup() {
        ParkingFloor floor1 = new ParkingFloor(1, 5, 5, 2);
        ParkingFloor floor2 = new ParkingFloor(2, 5, 5, 2);
        parkingLot = new ParkingLot(List.of(floor1, floor2));
    }

    @Test
    void testParkVehicle() {
        Vehicle car = new Car("AB1234");
        assertTrue(parkingLot.parkVehicle(car));
    }

    @Test
    void testRetrieveVehicle() {
        Vehicle car = new Car("AB1234");
        parkingLot.parkVehicle(car);
        Ticket ticket = new Ticket(car, parkingLot.getAvailableSpot(car), LocalDateTime.now());

        // Simulate exit after 2 hours
        LocalDateTime exitTime = ticket.getEntryTime().plusHours(2);
        int fee = parkingLot.calculateFee(ticket, exitTime);

        assertEquals(40, fee); // Assuming 20 per hour
        assertTrue(parkingLot.retrieveVehicle(ticket));
    }
}
