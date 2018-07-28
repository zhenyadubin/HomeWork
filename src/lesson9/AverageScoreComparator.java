package lesson9;

import java.util.Comparator;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class AverageScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() < o2.getAverageScore()) {
            return -1;
        } else if (o1.getAverageScore() > o2.getAverageScore()) {
            return 1;
        } else return 0;
    }
}
