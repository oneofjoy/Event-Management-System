import controller.AuthController;
import controller.EventController;
import controller.TicketController;
import data.DataStore;
import model.Customer;
import model.User;
import model.Event;

public class Main {

    public static void main(String[] args) {

        // dummy data
        DataStore.users.add(
            new User("admin", "123", "ADMIN")
        );

        Event event1 = new Event("E01", "Music Festival", 5);
        Event event2 = new Event( "E02", "Seminar", 2 );

        DataStore.events.add(event1);
        DataStore.events.add(event2);

        AuthController authController = new AuthController();

        User loginUser = authController.login();

        if(loginUser != null) {

            System.out.println(
                "Welcome " + loginUser.getUsername()
            );
        }

        EventController eventController = new EventController();

        eventController.menu();

        User customer = new Customer( "budi", "123");

        TicketController tc = new TicketController();

        tc.buyTicket(customer);
    }
}