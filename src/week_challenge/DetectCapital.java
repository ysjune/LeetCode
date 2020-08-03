package week_challenge;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word == null || word == "") {
            return false;
        }
        if (word.length() == 1) {
            return true;
        }
        boolean isFirstCapital = Character.isUpperCase(word.charAt(0));
        boolean isSecondCapital = Character.isUpperCase(word.charAt(1));
        if (word.length() == 2) {
            if (!isFirstCapital && isSecondCapital) {
                return false;
            }
        }

        for (int i = 2; i < word.length(); i++) {
            if (isFirstCapital && isSecondCapital) {
                if (!Character.isUpperCase(word.charAt(i))) return false;
            } else if(!isFirstCapital && isSecondCapital) {
                return false;
            } else {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }

    /**
     *
     * Given a word, you need to judge whether the usage of capitals in it is right or not.
     *
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     *
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Otherwise, we define that this word doesn't use capitals in a right way.
     *
     *
     * Example 1:
     * Input: "USA"
     * Output: True
     *
     *
     * Example 2:
     * Input: "FlaG"
     * Output: False
     *
     */
    public static void main(String[] args) {
        DetectCapital solution = new DetectCapital();
        boolean usa = solution.detectCapitalUse("cVe");
        System.out.println(usa);
    }

}
