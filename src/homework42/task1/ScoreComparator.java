package homework42.task1;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Integer.compare((int) s2.getScore(), (int) s1.getScore()); // Сортировка по убыванию рейтинга
    }
}