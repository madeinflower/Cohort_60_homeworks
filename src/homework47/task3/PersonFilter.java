package homework47.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

public class PersonFilter {

    public static List<Person> filterPeople(List<Person> people, int minAge, String city) {
        return people.stream()
                .filter(p -> p.getAge() > minAge)
                .filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "Berlin"));
        people.add(new Person("Bob", 22, "Berlin"));
        people.add(new Person("Charlie", 28, "Munich"));
        people.add(new Person("Diana", 35, "Berlin"));
        people.add(new Person("Eve", 24, "Berlin"));

        List<Person> filtered = filterPeople(people, 25, "Berlin");
        filtered.forEach(System.out::println);
    }
}

