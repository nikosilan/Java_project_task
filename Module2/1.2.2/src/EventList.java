
import java.util.PriorityQueue;

public class EventList {

    private PriorityQueue<Event> events;

    public EventList() {
        events = new PriorityQueue<>();
    }

    // Add a new event
    public void addEvent(Event event) {
        events.add(event);
    }

    // Get and remove the next event
    public Event getNextEvent() {
        return events.poll();
    }

    // Check if the event list is empty
    public boolean isEmpty() {
        return events.isEmpty();
    }

    // Get the number of events
    public int size() {
        return events.size();
    }
}
