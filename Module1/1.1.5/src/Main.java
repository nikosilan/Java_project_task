
public class Main {

    public static void main(String[] args) {

        ServicePoint servicePoint = new ServicePoint();

        CustomerGenerator generator =
                new CustomerGenerator(servicePoint);

        generator.generateCustomers(5);

        System.out.println("\nStarting service...\n");

        servicePoint.serve();

        System.out.println("All customers have been served.");
    }
}
