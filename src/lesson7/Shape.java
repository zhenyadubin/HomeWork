package lesson7;

/**
 * Created by Zhenya on 27.07.2018.
 */
public abstract class Shape {

    public abstract double area();

    public void isEqualAreas(Shape shape2) {
        System.out.println(area() == shape2.area());
    }
}
