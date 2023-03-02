package CodeWars;

import java.util.*;

public class TheObservedPIN {

    public static void main(String[] args) {

    }

    private static Map<String, List<String>> map = Map.of(
            "1", Arrays.asList("1", "2", "4"),
            "2", Arrays.asList("1", "2", "3", "5"),
            "3", Arrays.asList("2", "3", "6"),
            "4", Arrays.asList("1", "4", "5", "7"),
            "5", Arrays.asList("2", "4", "5", "6", "8"),
            "6", Arrays.asList("3", "5", "6", "9"),
            "7", Arrays.asList("4", "7", "8"),
            "8", Arrays.asList("5", "7", "8", "9", "0"),
            "9", Arrays.asList("6", "8", "9"),
            "0", Arrays.asList("0", "8")
    );

    public static List<String> getPINs(String observed) {
        List<String> list = new ArrayList<>();
        solver("", observed, list);
        return list;
    }

    private static void solver(String currentPass, String restToSolve, List<String> list) {
        if (restToSolve.length() == 0) {
            list.add(currentPass);
            return;
        }
        List<String> x = map.get(restToSolve.substring(0,1));
        for (String s : x) {
            solver(currentPass + s, restToSolve.substring(1), list);
        }
    }
}
