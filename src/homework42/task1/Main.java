package homework42.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Sportsman[] sportsmen = {
                new Sportsman("Ann", 25, 90),
                new Sportsman("Bob", 23, 80),
                new Sportsman("Alice", 27, 95)
        };

        Arrays.sort(sportsmen);
        System.out.println("Sorting by name:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);
        }

        Arrays.sort(sportsmen, new ScoreComparator());
        System.out.println("\nSorting by score:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);
        }

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Double.compare(s1.getAge(), s2.getAge());
            }
        });

        System.out.println("\nSorting by age:");
        for (Sportsman s : sportsmen) {
            System.out.println(s);
        }
    }
}
