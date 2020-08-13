package week_challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_Triangle_II {

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            return Arrays.asList(1);
        }

        if(rowIndex == 1) {
            return Arrays.asList(1,1);
        }

        List<List<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
            List<Integer> list2 = new ArrayList<>(rowIndex);
            list2.add(0, 1);
            for (int j = 0; j < i; j++) {
                list2.add(arrayList.get(i-1).get(j) + arrayList.get(i-1).get(j+1));
            }
            list2.add(1);
            arrayList.add(list2);
        }

        return arrayList.get(rowIndex-1);
    }


    public static void main(String[] args) {
        Pascals_Triangle_II solution = new Pascals_Triangle_II();
        System.out.println(solution.getRow(1));
    }

}
