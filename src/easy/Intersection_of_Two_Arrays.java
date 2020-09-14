package easy;

import java.util.HashSet;

public class Intersection_of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }

    public static void main(String[] args) {
        Intersection_of_Two_Arrays solution = new Intersection_of_Two_Arrays();
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(solution.intersection(num1, num2));
    }
}
