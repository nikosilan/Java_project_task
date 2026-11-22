
import eduni.distributions.Uniform;

public class ArrivalProcess {

    private int eventType;
    private Uniform generator;

    // Constructor
    public ArrivalProcess(int eventType) {
        this.eventType = eventType;
        generator = new Uniform(1.0, 5.0);
    }


    public void generateNext(EventList eventList) {


        double interval = generator.sample();


        Clock clock = Clock.getInstance();


        double newTime = clock.getTime() + interval;


        clock.setTime(newTime);


        Event event = new Event(eventType, newTime);

        
        eventList.add(event);
    }
}
