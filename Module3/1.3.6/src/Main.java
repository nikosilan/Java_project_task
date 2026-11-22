
public class Main {

    public static void main(String[] args) {

        // Luodaan tapahtumalista
        EventList eventList = new EventList();

        // Haetaan kello
        Clock clock = Clock.getInstance();

        // Asetetaan aloitusaika nollaan
        clock.setTime(0.0);

        // Luodaan ArrivalProcess
        ArrivalProcess arrivalProcess = new ArrivalProcess(1);

        // Luodaan 10 saapumistapahtumaa
        for (int i = 0; i < 10; i++) {
            arrivalProcess.generateNext(eventList);
        }

        // Tulostetaan tapahtumat
        System.out.println("Arrival events:");

        eventList.printEvents();

        // Tulostetaan tapahtumien määrä
        System.out.println("Number of events: " + eventList.size());

        // Tulostetaan lopullinen kellonaika
        System.out.println("Final clock time: " + clock.getTime());
    }
}
