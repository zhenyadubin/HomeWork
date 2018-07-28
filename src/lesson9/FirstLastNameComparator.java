package lesson9;

import java.util.Comparator;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class FirstLastNameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        int compareResult = o1.getFirstName().compareTo(o2.getFirstName());
        if (compareResult == 0) {
            compareResult = o1.getLastName().compareTo(o2.getLastName());
        }
        return compareResult;
    }
}
