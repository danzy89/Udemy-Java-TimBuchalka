public class AreaCalculator {
    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double area = Math.PI * (radius * radius);
        return area;
    }

    public static double area (double x, double y) {
        if (x < 0.0 || y < 0.0) {
            return -1.0;
        }
        double rectangle = x * y;
        return rectangle;
    }
}
