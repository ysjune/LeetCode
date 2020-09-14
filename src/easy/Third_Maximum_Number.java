package easy;

import java.util.*;

public class Third_Maximum_Number {

    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        if(list.size() < 3) {
            return list.get(0);
        }
        return list.get(2);
    }

    public static void main(String[] args) {
        Third_Maximum_Number solution = new Third_Maximum_Number();
        int[] i = {3,2,1};
        System.out.println(solution.thirdMax(i));
    }
}
