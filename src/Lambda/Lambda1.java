package Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lambda1 {

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
        // print all
        for (Point point : points) {
            System.out.println(point);
        }

        points.forEach(e -> System.out.println(e));

        points.forEach(System.out::println);

        System.out.println("----------------------------------------------");

        // print with special formatting
        Point p = points.get(0);
        System.out.println("["+p.x + "," + p.y + "]");

        points.forEach(e -> System.out.println("["+e.x + "," + e.y + "]"));

        points.forEach(e -> printFormatted(e));

        points.forEach(Lambda1::printFormatted);
    }

    private static void printFormatted(Point p){
        System.out.println("["+p.x + "," + p.y + "]");
    }
}
