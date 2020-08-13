package week_challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class H_Index {

    public int hIndex(int[] citations) {
        if(citations == null) {
            return 0;
        }
        Arrays.sort(citations);
        int count = 0;
        int index = 1;
        for (int i = citations.length; i > 0; i--) {
            if(citations[i-1] >= index++) {
                count++;
                continue;
            }
            break;
        }
        return count;
    }

    public static void main(String[] args) {
        H_Index solution = new H_Index();
        int[] citations = {3,0,6,1,5};
        System.out.println(solution.hIndex(citations));
    }
}
