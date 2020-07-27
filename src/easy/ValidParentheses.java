package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder(s);
        List<Character> collect = sb.chars().boxed().map(v -> (char) Integer.parseInt(String.valueOf(v))).collect(Collectors.toList());

        List<Character> startParenthese = Arrays.asList('(','[','{');
        try {
            collect.stream().forEach(
                    a -> {
                        if(startParenthese.contains(a)) {
                            stack.add(a);
                        } else {
                            char peek = (char) stack.peek();
                            if(')' == a && '(' == peek) {
                                stack.pop();
                            } else if (']' == a && '[' == peek) {
                                stack.pop();
                            } else if ('}' == a &&'{' == peek) {
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

    public static void main(String[] args) {

        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(])"));
    }
}
