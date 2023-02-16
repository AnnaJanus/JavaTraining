package CodeWars;

import java.util.stream.IntStream;

public class AWolfInSheepsClothing {

    public static void main(String[] args) {
        String[] array = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
        System.out.println(warnTheSheep(array));
    }

    public static String warnTheSheep(String[] array) {
        int wolfIndex = IntStream.range(0, array.length)
                .filter(i -> "wolf".equals(array[i]))
                .findFirst()
                .getAsInt();
        return wolfIndex == array.length-1?
                "Pls go away and stop eating my sheep" :
                "Oi! Sheep number "+(array.length-1-wolfIndex)+"! You are about to be eaten by a wolf!";
    }
}
