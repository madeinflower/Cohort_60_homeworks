package homework28.humanHierarchy;

public class ProfessionalAthlete extends Human {
    @Override
    public void run() {
        System.out.println("A professional athlete runs at a speed of 25 km/h");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("A professional athlete needs 5 minutes of rest");
    }
}
