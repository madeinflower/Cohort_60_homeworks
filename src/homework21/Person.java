package homework21;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void introduce() {
        System.out.printf("Меня зовут %s, мне %d лет, моя профессия %s.%n", name, age, profession);
    }
}