package easy;

public class Range_Sum_Query {

    int[] nums;
    public Range_Sum_Query(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int temp = 0;
        for (int k = i; k <= j; k++) {
            temp += nums[k];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Range_Sum_Query obj = new Range_Sum_Query(nums);
        int param_1 = obj.sumRange(0,2);
        System.out.println(param_1);
    }
}
