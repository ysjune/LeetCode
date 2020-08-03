package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Word_Pattern {

    public boolean wordPattern(String pattern, String str) {

        List<String> strings = Arrays.asList(str.split(" "));
        Map hashMap = new HashMap();

        if(pattern.toCharArray().length != strings.size()) {
            return false;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (hashMap.containsKey(pattern.charAt(i))) {
                char c = pattern.charAt(i);
                if (!hashMap.get(c).equals(strings.get(i))) {
                    return false;
                }
            } else {
                if(hashMap.containsValue(strings.get(i))) {
                    return false;
                }
                hashMap.put(pattern.charAt(i), strings.get(i));
            }
        }

        return true;
    }

    /**
     *
     * Given a pattern and a string str, find if str follows the same pattern.
     *
     * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
     *
     * Example 1:
     * Input: pattern = "abba", str = "dog cat cat dog"
     * Output: true
     *
     * Example 2:
     * Input:pattern = "abba", str = "dog cat cat fish"
     * Output: false
     *
     * Example 3:
     * Input: pattern = "aaaa", str = "dog cat cat dog"
     * Output: false
     *
     * Example 4:
     * Input: pattern = "abba", str = "dog dog dog dog"
     * Output: false
     *
     * Notes:
     * You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
     *
     */
    public static void main(String[] args) {
        Word_Pattern solution = new Word_Pattern();
        String pattern = "abbc";
        String str = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, str));
    }
}
