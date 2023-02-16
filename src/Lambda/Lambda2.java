package Lambda;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

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

        // sum all elements
        int result = points.stream()
                .mapToInt(p -> p.x)
                .peek(x -> System.out.println(x + " "))
                .reduce(0, (x1,x2) -> x1 + x2);
        System.out.println("result: "+result);

        int result2 = points.stream()
                .mapToInt(p -> p.x)
                .sum();
        System.out.println("result2: "+result2);

        // print sum only if present
        points.stream()
                .mapToInt(p->p.x)
                .reduce((x1, x2)-> x1+x2)
                .ifPresent(s -> System.out.println("sum: "+ s));
        new ArrayList<Point>().stream()
                .mapToInt(p->p.x)
                .reduce((x1, x2)-> x1+x2)
                .ifPresent(s -> System.out.println("sum: "+ s));

    }
}
