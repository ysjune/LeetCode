package easy;

import java.util.stream.IntStream;

public class Climbing_Stairs {

    public int climbStairs(int n) {
        int[] cache = new int[46];
        cache[0] = 1;
        cache[1] = 2;

        IntStream.range(2, n).forEach(a -> {
            cache[a] = cache[a-1] + cache[a-2];
        });

        return cache[n-1];
    }

//    public int climbStairs(int n) {
//        int a = 1;
//        int b = 2;
//        if (n==0) return 0;
//        if (n==1) return a;
//        if (n==2) return b;
//        int sum = 0;
//        for (int i=3; i<=n; i++) {
//            sum = a+b;
//            a=b;
//            b=sum;
//        }
//        return sum;
//    }

    /**
     *
     * You are climbing a stair case. It takes n steps to reach to the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * Example 1:
     * Input: 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     *
     *
     * Example 2:
     * Input: 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     *
     *
     * Constraints:
     * 1 <= n <= 45
     *
     */
    public static void main(String[] args) {
        Climbing_Stairs solution = new Climbing_Stairs();
        int i = solution.climbStairs(4);
        System.out.println(i);
    }
}
