package repository;

import data.DataStore;
import model.User;

public class UserRepository {

    public User findByUsername(String username) {

        for(User user : DataStore.users) {

            if(user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }

        return null;
    }

    public void addUser(User user) {
        DataStore.users.add(user);
    }
}