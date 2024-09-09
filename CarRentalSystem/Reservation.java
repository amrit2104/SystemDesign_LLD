import Product.User;
import Product.Vehicle;
import java.util.*;

public class Reservation {
    Integer res_id;
    User user;
    Vehicle vehicle;
    Date bookedFrom;
    Date bookedTo;
    Location pickup;
    Location drop;
    ReservationStatus res_status;

    public int createReservation(User user, Vehicle vehicle)
    {
        res_id = 12345;
        this.user = user;
        this.vehicle = vehicle;
        res_status = ReservationStatus.INPROGRESS;

        return res_id;
    }

    public void getDetails()
    {
        System.out.println(res_id + " " + res_status);
    }
}
