package CarRentalSystemObjects;

import CarRentalSystemObjects.Models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalSystem {
    Map<String,User> emailId_userMap = new HashMap<>();
    List<User> usersWithBooking = new ArrayList<>();
    List<Store> stores = new ArrayList<>();

    public List<Store> findStore(int PINCode){
        List<Store> storeList = new ArrayList<>();
        for(Store store:stores){
            if(store.getPINCode()==PINCode)
                storeList.add(store);
        }
        return storeList;
    }
    public void addUser(User user){
        emailId_userMap.put(user.getMailId(), user);
    }
    public void removeUser(User user){
        emailId_userMap.remove(user.getMailId());
    }
    public void addStore(Store store){
        stores.add(store);
    }
}
