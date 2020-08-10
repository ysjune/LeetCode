package easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Majority_Element {

    /**
     * Arrays.sort(nums);
     * return nums[nums.length / 2];
     * 생각지도 못한 방법... 너무나 간단...
     */
    public int majorityElement(int[] nums) {

        int major = (nums.length/2) + 1;
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.replace(nums[i], map.get(nums[i])+1);
            }
        }

        List<Map.Entry<Integer, Integer>> collect = map.entrySet().stream().filter(v -> v.getValue() >= major).collect(Collectors.toList());
        return collect.get(0).getKey();
    }

    /**
     *
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     *
     * You may assume that the array is non-empty and the majority element always exist in the array.
     *
     * Example 1:
     * Input: [3,2,3]
     * Output: 3
     *
     * Example 2:
     * Input: [2,2,1,1,1,2,2]
     * Output: 2
     */
    public static void main(String[] args) {
        Majority_Element solution = new Majority_Element();
        int[] inputs = {1,1,1,1,1,1,8};
        int i = solution.majorityElement(inputs);
        System.out.println(i);
    }

}
