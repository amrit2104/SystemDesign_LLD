import Product.Vehicle;
import Product.User;
import Product.VehicleType;

import java.util.*;

public class Store {
    int store_id;
    VehicleInventoryManagement vehicleInventory;
    Location location;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType)
    {
        return vehicleInventory.getVehicles();
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        vehicleInventory = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user)
    {
        Reservation reservation = new Reservation();
        reservation.createReservation(user,vehicle);
        reservations.add(reservation);

        return reservation;
    }

    public void completeReservation(Reservation reservation)
    {
        reservation.res_status = ReservationStatus.COMPLETED;
        System.out.println("Reservation status is changed to Completed");
    }
}
