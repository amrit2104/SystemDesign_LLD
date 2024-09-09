package Product;
import java.util.*;

public class User {
    Integer userId;
    String driverLicense;

        public int getUserId() {
            return userId;
        }
        public void setUserId(int userId) {
            this.userId = userId;
        }
        public String getDrivingLicense() {
            return driverLicense;
        }
        public void setDrivingLicense(String driverLicense) {
            this.driverLicense = driverLicense;
        }

        public void getDetails()
        {
            System.out.println("user_id: " + userId);
        }

}
