package easy;

public class Factorial_Trailing_Zeroes {

    public int trailingZeroes(int n) {

        if(n == 0) {
            return 0;
        }
        int count = 0;
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        return count;
    }

    /**
     *
     * Given an integer n, return the number of trailing zeroes in n!.
     *
     * Example 1:
     * Input: 3
     * Output: 0
     *
     * Explanation: 3! = 6, no trailing zero.
     *
     * Example 2:
     * Input: 5
     * Output: 1
     *
     * Explanation: 5! = 120, one trailing zero.
     * Note: Your solution should be in logarithmic time complexity.
     *
     */
    public static void main(String[] args) {
        Factorial_Trailing_Zeroes solution = new Factorial_Trailing_Zeroes();
        System.out.println(solution.trailingZeroes(10));
    }
}