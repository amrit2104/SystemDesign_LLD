package com.parkinglot;

import com.parkinglot.ParkingLot;
import com.parkinglot.Car;        // Importing source classes
import com.parkinglot.Bike;
import com.parkinglot.Vehicle;
import com.parkinglot.Ticket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.Tests;
// import org.junit.jupiter.api.TestCase;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import com.parkinglot.*;

class ParkingLotTest {

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

        LocalDateTime exitTime = ticket.getEntryTime().plusHours(2);
        int fee = parkingLot.calculateFee(ticket, exitTime);
        assertEquals(40, fee);

        assertTrue(parkingLot.retrieveVehicle(ticket));
    }

    @Test
    void testNoAvailableSpot() {
        for (int i = 0; i < 12; i++) {
            parkingLot.parkVehicle(new Car("CAR" + i));
        }
        Vehicle anotherCar = new Car("AB5678");
        assertFalse(parkingLot.parkVehicle(anotherCar));
    }
}
