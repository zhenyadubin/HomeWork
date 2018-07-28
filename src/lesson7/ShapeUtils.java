package lesson7;

/**
 * Created by Zhenya on 28.07.2018.
 */
public class ShapeUtils {

    public static boolean isTriangle(Triangle triangle) {
        return (triangle.getPoint1().distance(triangle.getPoint2()))
                + (triangle.getPoint2().distance(triangle.getPoint3()))
                != (triangle.getPoint3().distance(triangle.getPoint1()))
                && (triangle.getPoint2().distance(triangle.getPoint3()))
                + (triangle.getPoint3().distance(triangle.getPoint1()))
                != (triangle.getPoint1().distance(triangle.getPoint2()))
                && (triangle.getPoint3().distance(triangle.getPoint1()))
                + (triangle.getPoint1().distance(triangle.getPoint2()))
                != (triangle.getPoint2().distance(triangle.getPoint3()));
    }

    public static boolean isRectangle(Trapezium trapezium) {
        return (Math.rint(trapezium.getPoint1().distance(trapezium.getPoint2()) * trapezium.getPoint1().distance(trapezium.getPoint2()))
                + Math.rint(trapezium.getPoint1().distance(trapezium.getPoint4()) * trapezium.getPoint1().distance(trapezium.getPoint4()))
                == Math.rint(trapezium.getPoint2().distance(trapezium.getPoint4()) * trapezium.getPoint2().distance(trapezium.getPoint4())))
                && (Math.rint(trapezium.getPoint1().distance(trapezium.getPoint4()) * trapezium.getPoint1().distance(trapezium.getPoint4()))
                + Math.rint(trapezium.getPoint3().distance(trapezium.getPoint4()) * trapezium.getPoint3().distance(trapezium.getPoint4()))
                == Math.rint(trapezium.getPoint1().distance(trapezium.getPoint3()) * trapezium.getPoint1().distance(trapezium.getPoint3())));
    }
}
