import java.util.LinkedList;

public class ServicePoint {

    private final LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer customer) {
        queue.add(customer);
    }


    public Customer removeFromQueue() {
        return queue.poll();
    }

    public boolean hasCustomers() {
        return !queue.isEmpty();
    }

    public int queueSize() {
        return queue.size();
    }
}