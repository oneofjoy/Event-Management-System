package controller;

import java.util.Scanner;

import model.Event;
import model.Ticket;
import model.User;

import service.TicketService;
import data.DataStore;
import view.TicketView;

public class TicketController { 
    private Scanner scanner;

    private TicketService ticketService;

    private TicketView ticketView;

    public TicketController() {
        scanner = new Scanner(System.in);
        ticketService = new TicketService();
        ticketView = new TicketView();
    }

    public void buyTicket(User user) {

        // tampilkan event
        for(Event event : DataStore.events) {
            System.out.println( event.getEventId() + " | " + event.getTitle() + " | Quota : " + event.getQuota() );
        }

        System.out.print( "Input Event ID : " );

        String eventId = scanner.nextLine();
        Event selectedEvent = null;

        for(Event event : DataStore.events) {
            if(event.getEventId().equals(eventId)) {
                selectedEvent = event;
            }
        }

        if(selectedEvent == null) {
            System.out.println("Event Not Found" );
            return;
        }

        Ticket ticket = ticketService.buyTicket( user, selectedEvent);

        if(ticket != null) {
            ticketView.buySuccess();
        } else {
            ticketView.eventFull();
        }
    }
}