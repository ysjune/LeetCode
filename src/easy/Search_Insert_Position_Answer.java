package easy;

public class Search_Insert_Position_Answer {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int low=0;
        int high = nums.length-1;
        int middle=0;
        while(low <= high){
            middle = low + (high-low)/2;

            if(nums[middle] == target) return middle;

            if(nums[middle] < target){
                low = middle+1;
            }

            if(nums[middle] > target){
                high = middle-1;
            }
        }
        return low;
    }
}
