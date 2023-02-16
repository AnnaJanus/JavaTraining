package Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lambda3 {
    private static final List<Point> points = createPoints();

    private static List<Point> createPoints() {
        List<Point> result = new ArrayList<>();
        result.add(new Point(-4, -8));
        result.add(new Point(-2, 9));
        result.add(new Point(-1, -8));
        result.add(new Point(0, -7));
        result.add(new Point(1, 1));
        result.add(new Point(2, 3));
        result.add(new Point(2, 3));
        result.add(new Point(2, -2));
        result.add(new Point(4, -1));
        return result;
    }

    public static void main(String[] args) {
        points.stream().filter(e -> e.x > 0).forEach(System.out::println);
    }
}
