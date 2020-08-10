package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            Set<Character> sets = new HashSet<>();
            sets.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if (!sets.contains(s.charAt(j))) {
                    sets.add(s.charAt(j));
                    continue;
                }
                break;
            }
            list.add(sets.size());
        }
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > ret) {
                ret = list.get(i);
            }
        }
        return ret;
    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * <p>
     * Example 1:
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * <p>
     * Example 2:
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * <p>
     * Example 3:
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * <p>
     * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters solution = new Longest_Substring_Without_Repeating_Characters();
        int abcabcbb = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(abcabcbb);
    }
}
