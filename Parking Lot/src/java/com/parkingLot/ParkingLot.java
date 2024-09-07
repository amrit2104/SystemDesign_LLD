package com.parkinglot;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            if (floor.isSpotAvailable(vehicle)) {
                return floor.parkVehicle(vehicle);
            }
        }
        return false;
    }

    public boolean retrieveVehicle(Ticket ticket) {
        return ticket.getSpot().releaseVehicle();
    }

    public int calculateFee(Ticket ticket, LocalDateTime exitTime) {
        return Payment.calculateFee(ticket, exitTime);
    }
}
