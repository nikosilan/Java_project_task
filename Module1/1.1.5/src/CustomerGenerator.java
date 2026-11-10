
public class CustomerGenerator {

    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    public void generateCustomers(int numberOfCustomers) {

        for (int i = 0; i < numberOfCustomers; i++) {

            Customer customer = new Customer();
            customer.setStartTime(System.nanoTime());

            servicePoint.addToQueueue(customer);

            System.out.println("Customer added: " + customer.getId());
        }
    }
}
