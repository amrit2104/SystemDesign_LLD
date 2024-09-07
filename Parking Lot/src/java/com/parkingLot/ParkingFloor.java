class ParkingFloor {
    List<ParkingSpot> smallSpots;
    List<ParkingSpot> mediumSpots;
    List<ParkingSpot> largeSpots;
    int levelNumber;

    // Functions to check availability and manage spots
    boolean isSpotAvailable(Vehicle vehicle);
    ParkingSpot getAvailableSpot(Vehicle vehicle);
    void releaseSpot(ParkingSpot spot);
}
