package easy;

import java.util.Arrays;

public class Missing_Number {

    public int missingNumber(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }
        int ret = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) {
                ret = i+1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Missing_Number solution = new Missing_Number();
        int[] s = {3,0,1};
        System.out.println(solution.missingNumber(s));
    }
}
