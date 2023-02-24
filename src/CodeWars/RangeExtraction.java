package CodeWars;

import java.util.Arrays;

public class RangeExtraction {
    public static void main(String[] args) {
        String result = rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20});
        System.out.println(result);
    }

    public static String rangeExtraction(int[] arr) {
        String[] result = new String[0];
        int[] temp = new int[0];
        for (int i = 0; i < arr.length; i++) {
            do {

                temp = add(temp, arr[i]);
                if (i == arr.length - 1) {i++;break;}
                i++;
            } while (arr[i-1] + 1 == arr[i]);
            if (temp.length == 1) {
                result = add(result, Integer.toString(temp[0]));
            } else if (temp.length == 2) {
                result = add(result, Integer.toString(temp[0]));
                result = add(result, Integer.toString(temp[1]));
            } else {
                result = add(result, Integer.toString(temp[0]) + "-" + Integer.toString(temp[temp.length - 1]));
            }
            temp = new int[0];
            i--;
        }
        return String.join(",", result);
    }

    public static int[] addFromOneArrayToOther(int[] firstArray, int[] otherArray) {
        int length = otherArray.length;
        otherArray = Arrays.copyOf(otherArray, otherArray.length + firstArray.length);
        for (int i = 0; i < firstArray.length; i++) {
            otherArray[length + i] = firstArray[i];
        }
        return otherArray;
    }

    public static int[] add(int[] array, int number) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = number;
        return newArray;
    }

    public static String[] add(String[] array, String number) {
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = number;
        return newArray;
    }
}
