
public class Main {

    public static void main(String[] args) {


        Clock clock1 = Clock.getInstance();


        clock1.setTime(10.5);

        System.out.println("Time: " + clock1.getTime());

        // Haetaan toinen Clock-olio
        Clock clock2 = Clock.getInstance();


        clock2.setTime(20.5);


        System.out.println("Clock 1: " + clock1.getTime());
        System.out.println("Clock 2: " + clock2.getTime());


        System.out.println("Same object: " + (clock1 == clock2));
    }
}
