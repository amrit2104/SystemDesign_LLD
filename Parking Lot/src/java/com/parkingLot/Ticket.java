package com.parkinglot;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private String ticketNumber;
    private LocalDateTime entryTime;
    private ParkingSpot spot;
    private Vehicle vehicle;

    public Ticket(Vehicle vehicle, ParkingSpot spot, LocalDateTime entryTime) {
        this.ticketNumber = UUID.randomUUID().toString();
        this.entryTime = entryTime;
        this.spot = spot;
        this.vehicle = vehicle;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
