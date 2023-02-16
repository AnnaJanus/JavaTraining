package CodeWars;

import java.util.stream.LongStream;

public class SumOfCubes {
    public static void main(String[] args) {
        System.out.println(sumCubes(1));
        System.out.println(sumCubes(2));
        System.out.println(sumCubes(10));
        System.out.println(sumCubes(123));

    }

    public static long sumCubes(long n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += Math.pow(i,3);
        }
        return result;
    }

    public static long sumCubes2(long n){
        return LongStream.rangeClosed(1,n).map(i -> i*i*i).sum();
    }
}
