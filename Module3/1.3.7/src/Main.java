public class Main {

    public static void main(String[] args) {

        EventList eventList = new EventList();
        Clock clock = Clock.getInstance();
        clock.setTime(0.0);
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.ARRIVAL);
        ServicePoint servicePoint = new ServicePoint();


        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNext(eventList);
        }
        System.out.println("Events created: " + eventList.size());
        System.out.println("Clock after last event created: " + clock.getTime());


        while (!eventList.isEmpty()) {
            Event event = eventList.remove();
            if (event.getType() == EventType.ARRIVAL) {
                Customer customer = new Customer();
                customer.setArrivalTime(event.getTime());
                servicePoint.addToQueue(customer);
                System.out.println("Customer " + customer.getId()
                        + " arrived at " + customer.getArrivalTime());
            }
        }
        System.out.println("Customers in queue: " + servicePoint.queueSize());


        clock.setTime(clock.getTime() + 5);
        System.out.println("Clock moved to: " + clock.getTime());


        System.out.println("Servicing customers:");
        while (servicePoint.hasCustomers()) {
            Customer customer = servicePoint.removeFromQueue();
            customer.setDepartureTime(clock.getTime());
            System.out.printf("Customer %d: arrival %.3f, departure %.3f, time in system %.3f%n",
                    customer.getId(), customer.getArrivalTime(),
                    customer.getDepartureTime(), customer.getTimeInSystem());
        }
    }
}