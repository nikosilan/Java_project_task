
import java.util.ArrayList;
import java.util.List;

public class EventList {

    private List<Event> events;

    public EventList() {
        events = new ArrayList<>();
    }


    public void add(Event event) {
        events.add(event);
    }


    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }


    public int size() {
        return events.size();
    }
}
