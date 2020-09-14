package week_challenge;

public class Maximum_Product_Subarray {

    public int maxProduct(int[] nums) {

        int ret = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                 max = max * nums[j];
                 if(max > ret) {
                     ret = max;
                 }
            }
            if(nums[i] > ret) {
                ret = nums[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {

        Maximum_Product_Subarray ma = new Maximum_Product_Subarray();
        int[] i = {2,3,-2,4};
        System.out.println(ma.maxProduct(i));

    }
}
