
public class Event implements Comparable<Event> {

    private double eventTime;
    private EventType type;

    public Event(double eventTime, EventType type) {
        this.eventTime = eventTime;
        this.type = type;
    }

    public double getEventTime() {
        return eventTime;
    }

    public EventType getType() {
        return type;
    }

    @Override
    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event: " + type + ", Time: " + eventTime;
    }
}

enum EventType {
    ARRIVAL,
    DEPARTURE
}
