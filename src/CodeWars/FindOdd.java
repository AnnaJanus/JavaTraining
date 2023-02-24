package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindOdd {
    public static void main(String[] args) {
        System.out.println("result: " + 5 + " " + FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        System.out.println(-1 + " " + FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        System.out.println(5 + " " + FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        System.out.println(10 + " " + FindOdd.findIt(new int[]{10}));
        System.out.println(10 + " " + FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        System.out.println(1 + " " + FindOdd.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

    public static int findIt(int[] a) {
        List<Integer> aList = new ArrayList<>();
        for (int aa : a) {
            aList.add(aa);
        }
        return Arrays.stream(a).filter(e -> (Collections.frequency(aList, e) % 2 != 0)).findFirst().getAsInt();
    }
}
