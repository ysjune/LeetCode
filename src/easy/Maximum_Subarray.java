package easy;

public class Maximum_Subarray {

    public int maxSubArray(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max+nums[i]);
            ret = Math.max(ret, max);
        }
        return ret;
    }

    /**
     *
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Example:
     *
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Follow up:
     *
     * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     *
     */
    public static void main(String[] args) {
        Maximum_Subarray solution = new Maximum_Subarray();
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = solution.maxSubArray(input);
        System.out.println(i);
    }

}
