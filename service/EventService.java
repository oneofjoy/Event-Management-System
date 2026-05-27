package service;

import model.Event;
import repository.EventRepository;

public class EventService {

    private EventRepository eventRepository;

    public EventService() {

        eventRepository = new EventRepository();

    }

    public void createEvent( String eventId, String title, int quota) {

        Event event = new Event(eventId, title, quota);

        eventRepository.addEvent(event);
    }

    public Event getEventById(String id) {

        return eventRepository.findById(id);
    }

    public void showEvents() {

        eventRepository.showAllEvents();
    }
}