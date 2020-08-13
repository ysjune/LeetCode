package easy;

import java.util.HashMap;
import java.util.Stack;

public class Ransom_Note {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if(!map.containsKey(ransomNote.charAt(i))) {
                return false;
            }
            if(map.get(ransomNote.charAt(i)) == 0) {
                return false;
            } else {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) -1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ransom_Note solution = new Ransom_Note();
        System.out.println(solution.canConstruct("aa","aab"));
    }
}
