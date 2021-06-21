package service;

/**
 *
 * @author danny
 */

import model.User;

public class AccountService {
    
    public User login(String username, String password) {
        if ((username.equals("adam") && password.equals("password")) || (username.equals("betty") && password.equals("password"))) {
            String pass = null;
            return new User(pass);
        }
        else {
            return null;
        }
    }
}
