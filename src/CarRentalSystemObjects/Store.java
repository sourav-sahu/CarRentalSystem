package CarRentalSystemObjects;

import CarRentalSystemObjects.InventoryManager;
import CarRentalSystemObjects.Models.Reservation;
import CarRentalSystemObjects.Models.ReservationStatus;
import CarRentalSystemObjects.Models.User;
import CarRentalSystemObjects.Models.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {
    String address;
    int PINCode;
    InventoryManager inventoryManager;
    List<Reservation> reservationsList;

    public Store(String address, int PINCode) {
        this.address = address;
        this.PINCode = PINCode;
        this.inventoryManager = new InventoryManager();
        reservationsList = new ArrayList<>();
    }
    List<Vehicle> getVehicleList(){
        return inventoryManager.getAvailableVehicles();
    }

    public Reservation doRegistration(Vehicle vehicle, Date fromDate, Date toDate, User user){

        inventoryManager.removeVehicle(vehicle);
        Reservation reservation = new Reservation(vehicle,fromDate,toDate,user, ReservationStatus.SHEDULED);
        reservationsList.add(reservation);
        return reservation;
    }
    public void submitVehicle(Vehicle vehicle, Reservation reservation){

        inventoryManager.addVehicle(vehicle);
        reservationsList.remove(reservation);
    }
    public String getAddress() {
        return address;
    }

    public int getPINCode() {
        return PINCode;
    }

    public List<Reservation> getReservationsList() {
        return reservationsList;
    }
    public void addVehicle(Vehicle vehicle){
        inventoryManager.addVehicle(vehicle);
    }
}
