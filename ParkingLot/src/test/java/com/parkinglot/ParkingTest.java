import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import com.parkinglot.*;

class PaymentTest {

    @Test
    void testCalculateFeeForCar() {
        Vehicle car = new Car("AB1234");
        Ticket ticket = new Ticket(car, null, LocalDateTime.now().minusHours(3));
        int fee = Payment.calculateFee(ticket, LocalDateTime.now());
        assertEquals(60, fee);  // 3 hours * 20 per hour
    }

    @Test
    void testCalculateFeeForBike() {
        Vehicle bike = new Bike("BIKE123");
        Ticket ticket = new Ticket(bike, null, LocalDateTime.now().minusHours(1));
        int fee = Payment.calculateFee(ticket, LocalDateTime.now());
        assertEquals(10, fee);  // 1 hour * 10 per hour
    }

    @Test
    void testCalculateFeeForTruck() {
        Vehicle truck = new Truck("TRUCK123");
        Ticket ticket = new Ticket(truck, null, LocalDateTime.now().minusHours(5));
        int fee = Payment.calculateFee(ticket, LocalDateTime.now());
        assertEquals(200, fee);  // 5 hours * 40 per hour
    }
}
