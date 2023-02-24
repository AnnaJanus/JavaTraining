package CodeWars;

import java.util.Arrays;

public class CatchingCarMileageNumbers {
    public static void main(String[] args) {
//        The digits are sequential, incrementing†: 1234
//        The digits are sequential, decrementing‡: 4321
//        The digits are a palindrome: 1221 or 73837
        System.out.println(isInteresting(11209, new int[0]));
    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        System.out.println(number);
        if (check(number, awesomePhrases)) {
            return 2;
        } else if (check(number + 1, awesomePhrases)) {
            return 1;
        } else if (check(number + 2, awesomePhrases)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean check(int number, int[] awesomePhrases) {
        if (number < 100) {
            return false;
        }
        if (number % (Math.pow(10, String.valueOf(number).length() - 1)) == 0) {
            return true;
        }
        if (Arrays.stream(String.valueOf(number).split("")).distinct().toArray().length == 1) {
            return true;
        }
        if ("1234567890".contains(String.valueOf(number))) {
            return true;
        }
        if ("9876543210".contains(String.valueOf(number))) {
            return true;
        }
        if (Arrays.stream(awesomePhrases).anyMatch(e -> e == number)) {
            return true;
        }
        int num = number, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return number == reversed;
    }
}