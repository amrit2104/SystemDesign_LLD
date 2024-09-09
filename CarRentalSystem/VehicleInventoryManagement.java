import Product.Vehicle;
import java.util.*;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

    public VehicleInventoryManagement(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
