public class Customer {

    private static int nextId = 1;

    private final int id;
    private double arrivalTime;
    private double departureTime;

    public Customer() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }


    public double getTimeInSystem() {
        return departureTime - arrivalTime;
    }
}