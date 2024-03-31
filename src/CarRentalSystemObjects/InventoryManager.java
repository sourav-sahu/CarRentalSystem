package CarRentalSystemObjects;

import CarRentalSystemObjects.Models.Vehicle;
import CarRentalSystemObjects.Models.VehicleStatus;

import java.util.*;

public class InventoryManager {
    Map<String,Vehicle> vehicles = new HashMap<>();
    public void addVehicle(Vehicle vehicle){
        vehicles.put(vehicle.getRegistrationNumber(),vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        if(Objects.isNull(vehicles.remove(vehicle.getRegistrationNumber()))){
            System.out.println(vehicle.getRegistrationNumber()+" does not exist");
        }
    }
    public List<Vehicle> getAvailableVehicles(){
        List<Vehicle> vehicleList = new ArrayList<>();
        for(Map.Entry<String,Vehicle> e : vehicles.entrySet()){
            if (e.getValue().getVehicleStatus().equals(VehicleStatus.ACTIVE)){
                vehicleList.add(e.getValue());
            }
        }
        return vehicleList;
    }

}
