package CodeWars;

import java.util.Arrays;

public class WhichAreIn {
    static String[] result = new String[0];

    public static void main(String[] args) {
        String[] a = new String[]{ "arp", "live", "strong" };
        String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        inArray(a,b);
        System.out.println(Arrays.toString(result));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Arrays.stream(array1).forEach(e->{
            if(Arrays.stream(array2).anyMatch(f -> f.contains(e))){
                addToArray(e);
            }
        });

        Arrays.sort(result);
        return result;
    }

    private static void addToArray(String string){
        result = Arrays.copyOf(result, result.length + 1);
        result[result.length-1] = string;
    }

    public static String[] inArrayBetter(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(e->Arrays.stream(array2).anyMatch(f -> f.contains(e)))
                .distinct() //returns a stream consisting of distinct elements in a stream
                .sorted()
                .toArray(String[]::new);
    }
}
