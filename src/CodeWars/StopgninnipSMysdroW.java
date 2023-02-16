package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StopgninnipSMysdroW {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                List<Character> wordInChars = new ArrayList<>();
                for (char c : words[i].toCharArray()) {
                    wordInChars.add(c);
                }
                Collections.reverse(wordInChars);
                StringBuilder sb = new StringBuilder();
                for (Character ch : wordInChars) {
                    sb.append(ch);
                }
                words[i] = sb.toString();
            }
        }
        return String.join(" ", words);
    }
}
