
import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>();

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

            // Random service time between 100 and 500 ms
            long serviceTime = (long) (Math.random() * 400) + 100;

            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            long responseTime = waitingTime + serviceTime;

            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Waiting time: " + waitingTime + " ms");
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println("--------------------");
        }
    }
}
