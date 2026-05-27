import controller.AuthController;
import controller.EventController;
import data.DataStore;
import model.User;

public class Main {

    public static void main(String[] args) {

        // dummy data
        DataStore.users.add(
            new User("admin", "123", "ADMIN")
        );

        
        AuthController authController = new AuthController();

        User loginUser = authController.login();

        if(loginUser != null) {

            System.out.println(
                "Welcome " + loginUser.getUsername()
            );
        }

        EventController eventController = new EventController();

        eventController.menu();
    }
}