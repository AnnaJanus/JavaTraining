package CodeWars;

import java.util.Arrays;

public class SquareNSum {
    public static void main(String[] args) {
        int[] n = new int[10];
        n[0] = 10;
        n[2] = 2;
        System.out.println(Arrays.stream(n).map(e -> e * e).reduce(0, Integer::sum));
    }
}
