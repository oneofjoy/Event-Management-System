package service;

import data.DataStore;

import model.Event;
import model.Ticket;
import model.User;

public class TicketService {

    public Ticket buyTicket( User user, Event event ) {

        // cek quota
        if(event.getQuota() <= 0) {
            return null;
        }

        // kurangi quota
        event.setQuota( event.getQuota() - 1 );

        // generate id sederhana
        String ticketId = "T" + ( DataStore.tickets.size() + 1 );

        // buat ticket
        Ticket ticket = new Ticket( ticketId, user, event );

        // simpan ticket
        DataStore.tickets.add(ticket);

        return ticket;
    }

    public void showTickets() {

        for(Ticket ticket : DataStore.tickets) {
            System.out.println( ticket.getTicketId() + " | " + ticket.getUser().getUsername() + " | " + ticket.getEvent().getTitle());
        }
    }
}