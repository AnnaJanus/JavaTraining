package CodeWars;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println("no one likes this".equals(whoLikesIt()));
        System.out.println("Peter likes this".equals(whoLikesIt("Peter")));
        System.out.println("Jacob and Alex like this".equals(whoLikesIt("Jacob", "Alex")));
        System.out.println("Max, John and Mark like this".equals(whoLikesIt("Max", "John", "Mark")));
        System.out.println("Alex, Jacob and 2 others like this".equals(whoLikesIt("Alex", "Jacob", "Mark", "Max")));
    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}
