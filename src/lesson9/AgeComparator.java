package lesson9;

import java.util.Comparator;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
