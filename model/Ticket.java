package model;

public class Ticket {

    private String ticketId;
    private User user;
    private Event event;

    public Ticket( String ticketId, User user, Event event) {
        this.ticketId = ticketId;
        this.user = user;
        this.event = event;
    }

    public String getTicketId() {
        return ticketId;
    }

    public User getUser() {
        return user;
    }

    public Event getEvent() {
        return event;
    }
}