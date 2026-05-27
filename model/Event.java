package model;

public class Event {

    private String eventId;
    private String title;
    private int quota;

    public Event(String eventId, String title, int quota) {

        this.eventId = eventId;
        this.title = title;
        this.quota = quota;
    }

    public String getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}