package easy;

import java.util.*;

public class Single_Number {

    public int singleNumber(int[] nums) {
        Set<Integer> temp = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(!temp.contains(nums[i])) {
                temp.add(nums[i]);
            } else {
                temp.remove(nums[i]);
            }
        }

        return temp.stream().findFirst().orElse(0);
    }

    /**
     *
     * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
     *
     * Note:
     * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
     *
     * Example 1:
     * Input: [2,2,1]
     * Output: 1
     *
     * Example 2:
     * Input: [4,1,2,1,2]
     * Output: 4
     *
     * List 를 쓸 걸 그랬다.
     */
    public static void main(String[] args) {
        Single_Number solution = new Single_Number();
        int[] input = {2,2,1};
        int i = solution.singleNumber(input);
        System.out.println(i);
    }
}
