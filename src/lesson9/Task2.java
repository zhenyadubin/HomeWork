package lesson9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Артём", "Дзюба", 29, 7.9),
                new Student("Криштиану", "Роналду", 30, 9.7),
                new Student("Андрэ", "Шурле", 28, 8.4),
                new Student("Джон", "Тэри", 33, 9.2),
                new Student("Поль", "Погба", 25, 9.4),
                new Student("Златан", "Ибрагимович", 35, 9.1),
                new Student("Андрэ", "Инъеста", 34, 9.6)
        );

        print(students);
        maxAverageScore(students);

        students.sort(new FirstLastNameComparator());
        print(students);

        students.sort(new AgeComparator());
        print(students);

        students.sort(new AverageScoreComparator());
        print(students);

    }

    private static void maxAverageScore(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageScore() == findMax(students)) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    private static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    private static double findMax(List<Student> list) {
        double max = list.get(0).getAverageScore();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).getAverageScore()) {
                max = list.get(i).getAverageScore();
            }
        }
        return max;
    }
}
