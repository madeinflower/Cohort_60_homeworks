package homework28.humanHierarchy;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human amateur = new AmateurAthlete();
        Human professional = new ProfessionalAthlete();

        human.run();
        System.out.println();
        amateur.run();
        System.out.println();
        professional.run();
    }
}