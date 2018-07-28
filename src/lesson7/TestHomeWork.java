package lesson7;

/**
 * Created by Zhenya on 27.07.2018.
 */
public class TestHomeWork {

    public static void main(String[] args) {
        Shape[] shapes = {
                new RightTriangle(new Point(0, 0), new Point(1, 1)),
                new Triangle(new Point(2, 0), new Point(-3, 0), new Point(1, 5)),
                new IsoscelesTriangle(new Point(0, 30), new Point(2, 0)),
                new Trapezium(new Point(3, -5), new Point(6, 5), new Point(10, 5), new Point(11, -5))
        };

        for (Shape shape : shapes) {
            System.out.print(shape.area() + " ");
            shape.isEqualAreas(new Rectangle(new Point(0, 0), new Point(15, 4)));
        }

        System.out.println(ShapeUtils.isTriangle(new Triangle(new Point(3, 3), new Point(1, 1), new Point(2, 2))));
        System.out.println(ShapeUtils.isTriangle(new Triangle(new Point(-1, -1), new Point(1, 1), new Point(12, 13))));
        System.out.println(ShapeUtils.isRectangle(new Trapezium(new Point(-2, -3), new Point(1, 0), new Point(6, -5)
                , new Point(3, -8))));


    }
}
