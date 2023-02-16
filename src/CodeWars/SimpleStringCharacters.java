package CodeWars;

import java.util.Arrays;

public class SimpleStringCharacters {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solve("ah31a")));
    }

    public static int[] Solve(String word) {
        return new int[]{
                (int) Arrays.stream(word.split("")).filter(e -> e.matches("[A-Z]")).count(),
                (int) Arrays.stream(word.split("")).filter(e -> e.matches("[a-z]")).count(),
                (int) Arrays.stream(word.split("")).filter(e -> e.matches("[0-9]")).count(),
                (int) Arrays.stream(word.split("")).filter(e -> e.matches("[^A-Za-z0-9 ]")).count()
        };
    }
}
