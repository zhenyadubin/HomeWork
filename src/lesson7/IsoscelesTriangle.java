package lesson7;

/**
 * Created by Zhenya on 27.07.2018.
 */
public class IsoscelesTriangle extends Shape implements CalculateAltitude {

    private Point point1;
    private Point point2;

    public IsoscelesTriangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public IsoscelesTriangle() {
    }

    @Override
    public double area() {
        return Math.abs((point1.getX() - point2.getX()) * (point1.getY() - point2.getY()));
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "point1=" + point1.toString() +
                ", point2=" + point2.toString() +
                '}';
    }

    @Override
    public double altitude() {
        return Math.abs(point1.getY() - point2.getY());
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
}
