package week_challenge;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Repeated_Substring_Pattern {

    public boolean repeatedSubstringPattern(String s) {

        String fore = "";
        String back = "";
        for (int i = 0; i < s.length()/2; i++) {
            fore += s.charAt(i);
        }
        for (int i = s.length()/2; i < s.length(); i++) {
            back += s.charAt(i);
        }

        return fore.equals(back);
    }


    public static void main(String[] args) {
        Repeated_Substring_Pattern solution = new Repeated_Substring_Pattern();
        System.out.println(solution.repeatedSubstringPattern("abaab"));
    }
}
