package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Valid_Parentheses {

    public boolean isValid(String s) {

        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder(s);
        List<Character> collect = sb.chars().boxed().map(v -> (char) Integer.parseInt(String.valueOf(v))).collect(Collectors.toList());

        List<Character> startParenthese = Arrays.asList('(', '[', '{');
        try {
            collect.stream().forEach(
                    a -> {
                        if (startParenthese.contains(a)) {
                            stack.add(a);
                        } else {
                            char peek = (char) stack.peek();
                            if (')' == a && '(' == peek) {
                                stack.pop();
                            } else if (']' == a && '[' == peek) {
                                stack.pop();
                            } else if ('}' == a && '{' == peek) {
                                stack.pop();
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        }
                    }
            );
        } catch (Exception e) {
            return false;
        }

        return stack.isEmpty();
    }

    /**
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * <p>
     * An input string is valid if:
     * <p>
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Note that an empty string is also considered valid.
     * <p>
     * Example 1:
     * Input: "()"
     * Output: true
     * <p>
     * Example 2:
     * Input: "()[]{}"
     * Output: true
     * <p>
     * Example 3:
     * Input: "(]"
     * Output: false
     * <p>
     * Example 4:
     * Input: "([)]"
     * Output: false
     * <p>
     * Example 5:
     * Input: "{[]}"
     * Output: true
     */

    public static void main(String[] args) {

        Valid_Parentheses validParentheses = new Valid_Parentheses();
        System.out.println(validParentheses.isValid("(])"));
    }
}
