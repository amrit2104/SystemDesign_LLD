import Product.User;
import Product.Vehicle;
import java.util.*;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores)
    {
        this.users = users;
        this.stores = stores;
    }

    public Store getStore(Location location)
    {
        return stores.get(0);
    }
}
