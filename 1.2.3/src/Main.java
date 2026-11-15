
public class Main {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(10.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(5.0, EventType.EXIT));
        eventList.addEvent(new Event(15.0, EventType.ARRIVAL));
        eventList.addEvent(new Event(2.0, EventType.EXIT));

        while (!eventList.isEmpty()) {
            Event event = eventList.getNextEvent();
            System.out.println(event);
        }
    }
}
