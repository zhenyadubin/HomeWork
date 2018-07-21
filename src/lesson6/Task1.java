package lesson6;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(new Point(0, 0), new Point(5, 5));
        rectangle1.areaOfRectangle();
        rectangle1.diagonalOfRectangle();

        Rectangle rectangle2 = new Rectangle(new Point(0, 5), new Point(5, 0));
        rectangle2.areaOfRectangle();
        rectangle2.diagonalOfRectangle();

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setPoint1(new Point(0, 0));
        rectangle3.setPoint2(new Point(1, 1));
        rectangle3.areaOfRectangle();
        rectangle3.diagonalOfRectangle();
    }
}
