
import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueueue(Customer customer) {
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long waitingTime =
                    (System.nanoTime() - customer.getStartTime()) / 1_000_000;

            long serviceTime = (long) (Math.random() * 400) + 100;

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            long responseTime = waitingTime + serviceTime;

            totalServiceTime += serviceTime;
            servedCustomers++;

            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Waiting time: " + waitingTime + " ms");
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println("--------------------");
        }
    }

    public void printAverageServiceTime() {

        if (servedCustomers > 0) {
            double average = (double) totalServiceTime / servedCustomers;

            System.out.println("Average service time: " + average + " ms");
        } else {
            System.out.println("No customers were served.");
        }
    }
}
