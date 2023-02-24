package CodeWars;

import java.util.*;
import java.util.stream.Collectors;


public class WeightForWeight {
    public static void main(String[] args) {
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    public static String orderWeight(String string) {
        if("".equals(string)) {
            return "";
        }
        List<Long> temp = new ArrayList<>();
        String[] newArray = (string.split(" "));
        Arrays.sort(newArray);
        for (String number : newArray) {
            temp.add(Long.parseLong(number));
        }

        List<Long> result = temp.stream()
                .sorted(Comparator
                        .comparingLong(WeightForWeight::getSumOfDigits))
                .collect(Collectors.toList());

        String[] stringResult = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            stringResult[i] = String.valueOf(result.get(i));
        }

        return String.join(" ", stringResult);
    }

    public static long getSumOfDigits(long number) {
        return Arrays.stream(Long.toString(number).split(""))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
