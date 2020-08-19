package week_challenge;

import java.util.*;

public class H_Index {

    public int hIndex(int[] citations) {

        int max = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
            max = Math.max(max, citations[i]);
        }

        if(max == 1) {
            return 1;
        }

        for (int i = 1; i < max; i++) {
            if(!list.contains(i)) {
                return i;
            }
        }

        return max+1;


//        if(citations == null) {
//            return 0;
//        }
//
//        Arrays.sort(citations);
//        int count = 0;
//        int index = 1;
//        for (int i = citations.length; i > 0; i--) {
//            if(citations[i-1] >= index++) {
//                count++;
//                continue;
//            }
//            break;
//        }
//        return count;
    }

    public static void main(String[] args) {
        H_Index solution = new H_Index();
//        int[] citations = {3,0,6,1,5};
        int[] citations = {1,2,3};
        System.out.println(solution.hIndex(citations));
    }
}
