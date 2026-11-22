
public class Event {

    private int type;
    private double time;

    public Event(int type, double time) {
        this.type = type;
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event type: " + type + ", time: " + time;
    }
}
