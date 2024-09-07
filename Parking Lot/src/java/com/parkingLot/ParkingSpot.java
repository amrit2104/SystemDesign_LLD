package com.parkinglot;

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

    public boolean releaseVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
        return true;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }
}
