
public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setStartTime(1000);
        customer1.setEndTime(5000);

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Time spent: " + customer1.getTimeSpent());

        System.out.println("Customer ID: " + customer2.getId());
    }
}
