package easy;

import sun.security.util.Length;

public class Rotate_Array {
    public void rotate(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        Rotate_Array solution = new Rotate_Array();

        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        System.out.println(nums);
    }

}
