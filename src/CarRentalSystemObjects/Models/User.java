package CarRentalSystemObjects.Models;

public class User {
    String drivingLicence;
    String name;
    String Vehicle;
    String mailId;

    public User(String drivingLicence, String name, String mailId) {
        this.drivingLicence = drivingLicence;
        this.name = name;
        this.mailId = mailId;
    }

    public void setVehicle(String vehicle) {
        Vehicle = vehicle;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public String getName() {
        return name;
    }

    public String getVehicle() {
        return Vehicle;
    }

    public String getMailId() {
        return mailId;
    }
}
