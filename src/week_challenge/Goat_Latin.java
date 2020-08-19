package week_challenge;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Goat_Latin {

    public String toGoatLatin(String S) {
        String[] s = S.split(" ");
        List<Character> list = Arrays.asList('a', 'e', 'u', 'i', 'o');
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < s.length; i++) {
                if(list.contains(Character.toLowerCase(s[i].charAt(0))) || s[i].length() == 1) {
                    StringBuilder temp = new StringBuilder(String.valueOf(s[i])).append("ma");
                    for (int j = 0; j <= i; j++) {
                        temp.append("a");
                    }
                    sj.add(temp.toString());
                } else {
                    StringBuilder temp = new StringBuilder(s[i].substring(1)).append(s[i].charAt(0)).append("ma");
                    for (int j = 0; j <= i; j++) {
                        temp.append("a");
                    }
                    sj.add(temp.toString());
                }
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        Goat_Latin solution = new Goat_Latin();
        System.out.println(solution.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
