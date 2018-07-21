package lesson6;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Rectangle() {
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void areaOfRectangle() {
        int area = Math.abs((point1.getX() - point2.getX()) * (point1.getY() - point2.getY()));
        System.out.println("Площадь прямоугольника = " + area);
    }

    public void diagonalOfRectangle() {
        System.out.println("Длина диагонали прямоугольника = " + point1.distance(point2));
    }
}
