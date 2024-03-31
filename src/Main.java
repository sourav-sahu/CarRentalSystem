import CarRentalSystemObjects.Models.User;
import CarRentalSystemObjects.Models.Vehicle;
import CarRentalSystemObjects.Models.VehicleStatus;
import CarRentalSystemObjects.RentalSystem;
import CarRentalSystemObjects.Store;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store store1 = new Store("Bhubaneswar1",751003);
        Store store2 = new Store("Bhubaneswar2",751003);
        Store store3 = new Store("Rourkela",765009);
        Vehicle vehicle1 = new Vehicle("OD14001", VehicleStatus.ACTIVE);
        Vehicle vehicle2 = new Vehicle("OD14002", VehicleStatus.ACTIVE);
        Vehicle vehicle3 = new Vehicle("OD14003", VehicleStatus.ACTIVE);
        Vehicle vehicle4 = new Vehicle("OD14004", VehicleStatus.ACTIVE);
        store1.addVehicle(vehicle1);
        store1.addVehicle(vehicle2);
        store1.addVehicle(vehicle3);
        store1.addVehicle(vehicle4);
        User user = new User("DL011","Tanya","tanya@x.com");
        RentalSystem rentalSystem =new RentalSystem();
        rentalSystem.addStore(store1);
        rentalSystem.addStore(store2);
        rentalSystem.addStore(store3);
        rentalSystem.addUser(user);
        rentalSystem.







    }
}