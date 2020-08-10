package medium;

import java.util.*;
import java.util.stream.Stream;

public class Longest_Palindromic_Substring {

    public String longestPalindrome(String s) {

        // eye , 토마토
        List<Character> sets = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(!sets.contains(s.charAt(i))) {
                sets.add(s.charAt(i));
                continue;
            }
            String s1 = sets.stream().map(String::valueOf).toString() + s.charAt(i);
            String s2 = new StringBuilder(s1).reverse().toString();
            if(s1.equals(s2)) {
                return s1;
            } else {
                sets.clear();
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring solution = new Longest_Palindromic_Substring();
        System.out.println(solution.longestPalindrome("cbbd"));
    }
}
