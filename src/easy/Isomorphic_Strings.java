package easy;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                continue;
            }
            if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        HashSet<Character> sets = new HashSet<>(map.values());
        if (map.size() != sets.size()) {
            return false;
        }
        return true;

//        int[] m1 = new int[128];
//        int[] m2 = new int[128];
//        int n = s.length();
//        for (int i = 0; i < n; i++) {
//            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
//            m1[s.charAt(i)] = i + 1;
//            m2[t.charAt(i)] = i + 1;
//        }
//        return true;
    }

    /**
     *
     * Given two strings s and t, determine if they are isomorphic.
     *
     * Two strings are isomorphic if the characters in s can be replaced to get t.
     *
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
     *
     * Example 1:
     * Input: s = "egg", t = "add"
     * Output: true
     *
     * Example 2:
     * Input: s = "foo", t = "bar"
     * Output: false
     *
     * Example 3:
     * Input: s = "paper", t = "title"
     * Output: true
     *
     * Note:
     * You may assume both s and t have the same length.
     *
     *
     */
    public static void main(String[] args) {
        Isomorphic_Strings solution = new Isomorphic_Strings();
        System.out.println(solution.isIsomorphic("egg", "add"));
    }

}
