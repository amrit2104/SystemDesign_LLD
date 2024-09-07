package com.parkinglot;

import com.parkinglot.enums.VehicleType;
import com.parkinglot.enums.SpotSize;

public class ParkingSpot {
    private String spotNumber;
    private SpotSize size;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String spotNumber, SpotSize size) {
        this.spotNumber = spotNumber;
        this.size = size;
        this.isOccupied = false;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void releaseVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public SpotSize getSize() {
        return size;
    }
}
