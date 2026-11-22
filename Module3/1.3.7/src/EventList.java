import java.util.PriorityQueue;

public class EventList {


    private final PriorityQueue<Event> events = new PriorityQueue<>();

    public void add(Event event) {
        events.add(event);
    }


    public Event remove() {
        return events.poll();
    }

    public boolean isEmpty() {
        return events.isEmpty();
    }

    public int size() {
        return events.size();
    }
}