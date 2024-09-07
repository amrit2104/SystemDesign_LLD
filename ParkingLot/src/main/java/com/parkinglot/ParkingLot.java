package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.enums.SpotSize;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            if (floor.isSpotAvailable(vehicle)) {
                ParkingSpot spot = floor.getAvailableSpot(vehicle);
                spot.assignVehicle(vehicle);
                Ticket ticket = new Ticket(vehicle, spot, LocalDateTime.now());
                System.out.println("Vehicle parked. Ticket: " + ticket.getTicketNumber());
                return true;
            }
        }
        System.out.println("No available spot for vehicle: " + vehicle.getLicensePlate());
        return false;
    }

    public boolean retrieveVehicle(Ticket ticket) {
        ticket.getSpot().releaseVehicle();
        System.out.println("Vehicle retrieved with ticket number: " + ticket.getTicketNumber());
        return true;
    }

    public int calculateFee(Ticket ticket, LocalDateTime exitTime) {
        return Payment.calculateFee(ticket, exitTime);
    }
}
