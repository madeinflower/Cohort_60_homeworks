package homework28.humanHierarchy;

public class AmateurAthlete extends Human {
    @Override
    public void run() {
        System.out.println("An amateur athlete runs at a speed of 15 km/h");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("An amateur athlete needs 10 minutes of rest");
    }
}
