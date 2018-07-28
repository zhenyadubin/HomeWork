package lesson7;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class Trapezium extends Shape implements CalculateAngle, CalculateAltitude, CalculateDiagonal {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Trapezium(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Trapezium() {
    }

    @Override
    public double angle() {
        return Math.acos(((point4.distance(point1)) * (point4.distance(point1))
                + (point1.distance(point2)) * (point1.distance(point2))
                - (diagonal()) * (diagonal()))
                / (2 * (point4.distance(point1)) * (point1.distance(point2))));
    }

    @Override
    public double area() {
        return 0.5 * ((point2.distance(point3) + point1.distance(point4)) * altitude());
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "point1=" + point1.toString() +
                ", point2=" + point2.toString() +
                ", point3=" + point3.toString() +
                ", point4=" + point4.toString() +
                '}';
    }

    @Override
    public double altitude() {
        double result = Math.sin(angle()) * point1.distance(point2);
        return Math.rint(100.0 * result) / 100.0;
    }

    @Override
    public double diagonal() {
        return point2.distance(point4);
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

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

}
