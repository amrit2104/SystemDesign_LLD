package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.enums.SpotSize;

import java.time.Duration;
import java.time.LocalDateTime;

public class Payment {
    public static int calculateFee(Ticket ticket, LocalDateTime exitTime) {
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        int hours = (int) Math.ceil(duration.toMinutes() / 60.0);
        switch (ticket.getVehicle().getType()) {
            case BIKE: return hours * 10;
            case CAR: return hours * 20;
            case TRUCK: return hours * 40;
            default: throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
