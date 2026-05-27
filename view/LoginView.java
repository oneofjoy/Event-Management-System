package view;

public class LoginView {

    public void showLoginHeader() {

        System.out.println("====== LOGIN ======");
    }

    public void loginSuccess() {
        System.out.println("Login Success");
    }

    public void loginFailed() {
        System.out.println("Username / Password salah");
    }
}