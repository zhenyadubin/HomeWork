package lesson9;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageScore;

    public Student(String firstName, String lastName, int age, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

}
