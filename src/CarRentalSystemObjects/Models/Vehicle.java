package CarRentalSystemObjects.Models;

public class Vehicle {
    String registrationNumber;
    VehicleStatus vehicleStatus;

    public Vehicle(String registrationNumber, VehicleStatus vehicleStatus) {
        this.registrationNumber = registrationNumber;
        this.vehicleStatus = vehicleStatus;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
