package easy;

public class Search_Insert_Position {

    public int searchInsert(int[] nums, int target) {

        if(nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                count = i;
                break;
            }
        }

        if(nums[nums.length-1] < target) {
            count = nums.length;
        }

        return count;
    }

    /**
     *
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You may assume no duplicates in the array.
     *
     * Example 1:
     * Input: [1,3,5,6], 5
     * Output: 2
     *
     * Example 2:
     * Input: [1,3,5,6], 2
     * Output: 1
     *
     * Example 3:
     * Input: [1,3,5,6], 7
     * Output: 4
     *
     * Example 4:
     * Input: [1,3,5,6], 0
     * Output: 0
     */

    public static void main(String[] args) {
        Search_Insert_Position solution = new Search_Insert_Position();

        int[] input = {1,3,5,6};
        int i = solution.searchInsert(input, 7);
        System.out.println(i);

    }
}
