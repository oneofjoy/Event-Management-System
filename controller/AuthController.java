package controller;

import java.util.Scanner;

import model.User;
import service.AuthService;
import view.LoginView;

public class AuthController {

    private Scanner scanner;
    private AuthService authService;
    private LoginView loginView;

    public AuthController() {

        scanner = new Scanner(System.in);

        authService = new AuthService();

        loginView = new LoginView();
    }

    public User login() {

        loginView.showLoginHeader();

        System.out.print("Username : ");
        String username = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        User user = authService.login(username, password);

        if(user != null) {

            loginView.loginSuccess();

        } else {

            loginView.loginFailed();
        }

        return user;
    }
}