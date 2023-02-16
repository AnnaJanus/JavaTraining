package CodeWars;

public class IsNDivisibleByXAndY {
    public static void main(String[] args) {
        System.out.println(isDivisible(12,4,3));
        System.out.println(isDivisible(3,4,3));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return (n%x ==0) && (n%y ==0);
    }
}
