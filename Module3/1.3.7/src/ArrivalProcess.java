import eduni.distributions.Uniform;

public class ArrivalProcess {

    private final EventType eventType;
    private final Uniform generator;

    public ArrivalProcess(EventType eventType) {
        this.eventType = eventType;
        this.generator = new Uniform(1.0, 5.0);
    }


    public void generateNext(EventList eventList) {
        double interval = generator.sample();
        Clock clock = Clock.getInstance();
        double newTime = clock.getTime() + interval;
        clock.setTime(newTime);
        eventList.add(new Event(eventType, newTime));
    }
}