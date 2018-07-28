package lesson7;

/**
 * Created by Zhenya on 27.07.2018.
 */
public class Triangle extends Shape implements CalculateAngle, CalculateAltitude {

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle() {
    }

    @Override
    public double area() {
        double result = 0.5 * (point1.distance(point2)) * (point2.distance(point3)) * Math.sin(angle());
        return Math.rint(100.0 * result) / 100.0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1.toString() +
                ", point2=" + point2.toString() +
                ", point3=" + point3.toString() +
                '}';
    }

    @Override
    public double angle() {
        return Math.acos(((point1.distance(point2)) * (point1.distance(point2))
                + (point2.distance(point3)) * (point2.distance(point3))
                - (point3.distance(point1)) * (point3.distance(point1)))
                / (2 * (point1.distance(point2)) * (point2.distance(point3))));
    }

    @Override
    public double altitude() {
        double result = Math.sin(angle()) * point2.distance(point3);
        return Math.rint(100.0 * result) / 100.0;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
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
