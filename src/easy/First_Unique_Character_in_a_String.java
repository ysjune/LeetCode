package easy;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int resultIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                resultIndex = i;
                break;
            }
        }
        return resultIndex;

//        int[] map = new int[26];
//        for(char c: s.toCharArray()) {
//            map[c - 'a']++;
//        }
//        for(int i = 0; i < s.length(); i++) {
//            if(map[s.charAt(i) - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        First_Unique_Character_in_a_String solution = new First_Unique_Character_in_a_String();
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }
}
