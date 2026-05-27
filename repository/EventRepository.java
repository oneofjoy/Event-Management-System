package repository;

import data.DataStore;
import model.Event;

public class EventRepository {

    public void addEvent(Event event) {

        DataStore.events.add(event);
    }

    public Event findById(String eventId) {

        for(Event event : DataStore.events) {

            if(event.getEventId().equals(eventId)) {
                return event;
            }
        }

        return null;
    }

    public void showAllEvents() {

        for(Event event : DataStore.events) {

            System.out.println(
                event.getEventId() +
                " | " +
                event.getTitle() +
                " | Quota : " +
                event.getQuota()
            );
        }
    }
}