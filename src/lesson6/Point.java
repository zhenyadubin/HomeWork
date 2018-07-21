package lesson6;

/**
 * Created by Zhenya on 21.07.2018.
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point2) {
        double distance = Math.sqrt(((x - point2.getX()) * (x - point2.getX())) + ((y - point2.getY()) * (y - point2.getY())));
        return distance;
    }
}
