package controller;

import service.EventService;
import view.EventView;

import java.util.Scanner;

public class EventController {

    private Scanner scanner;
    private EventService eventService;
    private EventView eventView;
    public EventController() {

        scanner = new Scanner(System.in);
        eventService = new EventService();
        eventView = new EventView();
    }

    public void menu() {

        int choice;

        do {

            eventView.showMenu();

            System.out.print("Choose : ");
            choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {

                case 1:
                    createEvent();
                    break;
                case 2:
                    eventService.showEvents();
                    break;
            }

        } while(choice != 3);
    }

    public void createEvent() {

        System.out.print("Event ID : ");
        String id = scanner.nextLine();

        System.out.print("Title : ");
        String title = scanner.nextLine();

        System.out.print("Quota : ");
        int quota = Integer.parseInt(scanner.nextLine());

        eventService.createEvent(id, title, quota);

        eventView.eventCreated();
    }
}