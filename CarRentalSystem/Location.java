import java.util.*;

public class Location {
    Integer pinCode;
    String city;

    public Location(Integer pinCode, String city)
    {
        this.pinCode = pinCode;
        this.city = city;
    }

    public void getDetails()
    {
        System.out.println(pinCode + " " + city);
    }
}
