package easy;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] states = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            states[nums[i]] = true;
        }
        List<Integer> retList = new ArrayList<>();
        for (int i = 1; i < states.length; i++) {
            if(!states[i]) {
                retList.add(i);
            }
        }

        return retList;
    }

    /**
     *
     * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
     *
     * Find all the elements of [1, n] inclusive that do not appear in this array.
     *
     * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
     *
     * Example:
     * Input:
     * [4,3,2,7,8,2,3,1]
     *
     * Output:
     * [5,6]
     *
     */
    public static void main(String[] args) {
        Find_All_Numbers_Disappeared_in_an_Array solution = new Find_All_Numbers_Disappeared_in_an_Array();
        int[] inputs = {4,3,2,7,8,2,3,1};
        solution.findDisappearedNumbers(inputs);
    }

}
