package service;

import model.User;
import repository.UserRepository;

public class AuthService {

    private UserRepository userRepository;

    public AuthService() {
        userRepository = new UserRepository();
    }

    public User login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if(user == null) {
            return null;
        }

        if(user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }


}