package Product;

public class Vehicle {
    Integer vehicle_id;
    Integer vehicle_num;
    VehicleType vehicle_type;
    Integer kms;
    VehicleStatus status;

//    public Vehicle(Integer vehicle_id,Integer vehicle_num,VehicleType vehicle_type,Integer kms, VehicleStatus status)
//    {
//        this.vehicle_id = vehicle_id;
//        this.vehicle_num = vehicle_num;
//        this.vehicle_type = vehicle_type;
//        this.kms = kms;
//        this.status = status;
//    }
    public int getVehicleId()
    {
        return vehicle_id;
    }
    public void setVehicleId(Integer vehicle_id)
    {
        this.vehicle_id = vehicle_id;
    }

    public int getVehicleNum()
    {
        return vehicle_num;
    }
    public void setVehicleNum(Integer vehicle_num)
    {
        this.vehicle_num = vehicle_num;
    }

    public VehicleType getVehicleType()
    {
        return vehicle_type;
    }
    public void setVehicleType(VehicleType vehicle_type)
    {
        this.vehicle_type = vehicle_type;
    }

    public int getKms()
    {
        return kms;
    }
    public void setKms(Integer kms)
    {
        this.kms = kms;
    }

    public int getVehicleStatus()
    {
        return kms;
    }
    public void setVehicleStatus(VehicleStatus vehicleStatus)
    {
        this.status = vehicleStatus;
    }
}
