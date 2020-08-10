package easy;

public class Reverse_String {
    public void reverseString(char[] s) {
        String ss = "";
        for (int i = 0; i < s.length; i++) {
            ss += s[i];
        }

        s = new StringBuilder(ss).reverse().toString().toCharArray();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Reverse_String solution = new Reverse_String();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
        System.out.println(s);
    }
}
