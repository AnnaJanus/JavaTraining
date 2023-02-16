package CodeWars;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranslatingAPath {
    public static void main(String[] args) {
        System.out.println(walk("<<>>>>^vvv"));
    }

    public static String walk(String path) {
        StringBuilder result = new StringBuilder();
        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher matcher = pattern.matcher(path);
        Map<Character, String> valueChanger = Map.of(
                'v', "down",
                '^', "up",
                '<', "left",
                '>', "right"
        );
        while (matcher.find()) {
            int tmp = matcher.group().length();
            result.append("Take ").append(tmp).append((tmp == 1) ? " step " : " steps ").append(valueChanger.get(matcher.group().charAt(0))).append("\n");
        }
        return "".equals(result.toString()) ? "Paused" : result.substring(0,result.length()-1);

    }
}
