
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                Customer customer = new Customer();
                customer.setStartTime(System.nanoTime());

                queue.addFirst(customer);

                System.out.println("Customer added. ID: " + customer.getId());

            } else if (choice == 2) {

                if (queue.isEmpty()) {
                    System.out.println("Queue is empty.");
                } else {
                    Customer customer = queue.removeLast();

                    long waitingTime =
                            (System.nanoTime() - customer.getStartTime()) / 1_000_000;

                    System.out.println("Customer served: " + customer.getId());
                    System.out.println("Waiting time: " + waitingTime + " ms");
                }

            } else if (choice == 3) {
                running = false;
                System.out.println("Program ended.");

            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
