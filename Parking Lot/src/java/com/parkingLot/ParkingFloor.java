package com.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> smallSpots;
    private List<ParkingSpot> mediumSpots;
    private List<ParkingSpot> largeSpots;

    public ParkingFloor(int floorNumber, int smallCount, int mediumCount, int largeCount) {
        this.floorNumber = floorNumber;
        this.smallSpots = new ArrayList<>(smallCount);
        this.mediumSpots = new ArrayList<>(mediumCount);
        this.largeSpots = new ArrayList<>(largeCount);

        // Initialize parking spots
        for (int i = 0; i < smallCount; i++) smallSpots.add(new ParkingSpot("S" + i, SpotSize.SMALL));
        for (int i = 0; i < mediumCount; i++) mediumSpots.add(new ParkingSpot("M" + i, SpotSize.MEDIUM));
        for (int i = 0; i < largeCount; i++) largeSpots.add(new ParkingSpot("L" + i, SpotSize.LARGE));
    }

    public boolean isSpotAvailable(Vehicle vehicle) {
        return getAvailableSpot(vehicle) != null;
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle) {
        if (vehicle instanceof Bike) {
            return smallSpots.stream().filter(ParkingSpot::isAvailable).findFirst().orElse(null);
        } else if (vehicle instanceof Car) {
            return mediumSpots.stream().filter(ParkingSpot::isAvailable).findFirst().orElse(null);
        } else if (vehicle instanceof Truck) {
            return largeSpots.stream().filter(ParkingSpot::isAvailable).findFirst().orElse(null);
        }
        return null;
    }

    public void releaseSpot(ParkingSpot spot) {
        spot.releaseVehicle();
    }
}
