package week_challenge;

import java.util.*;

public class Bulls_and_Cows {

    public String getHint(String secret, String guess) {

        int bull = 0;
        int cow = 0;
        int[] a = new int[secret.length()];
        List<Character> list = new ArrayList<>();
        Arrays.fill(a, 0);
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                a[i] = 1;
                bull++;
                continue;
            }
            list.add(secret.charAt(i));
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0) {
                if(list.contains(guess.charAt(i))) {
                    cow++;
                    list.remove(Character.valueOf(guess.charAt(i)));
                }
            }
        }

        return new StringBuilder().append(bull).append("A").append(cow).append("B").toString();


    }

    public static void main(String[] args) {
        Bulls_and_Cows a = new Bulls_and_Cows();
        System.out.println(a.getHint("1", "0"));
    }
}
