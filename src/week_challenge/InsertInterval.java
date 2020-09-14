package week_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<Integer> newList = new ArrayList<>();
        for (int i = newInterval[0]; i <= newInterval[1]; i++) {
            newList.add(i);
        }

        Map<int[], Boolean> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            boolean isContain = false;
            int first = intervals[i][0];
            int end = intervals[i][1];
            if(newList.contains(first) || newList.contains(end)) {
                isContain = true;
            }
            map.put(intervals[i], isContain);
        }

        List<Map.Entry<int[], Boolean>> falseList = map.entrySet().stream().filter(v -> v.getValue() == false).collect(Collectors.toList());
        List<Map.Entry<int[], Boolean>> trueList = map.entrySet().stream().filter(v -> v.getValue() == true).collect(Collectors.toList());




        return intervals;
    }

    public static void main(String[] args) {

        InsertInterval so = new InsertInterval();
        int[][] ints = {{1,3},{6,9}};
        int[] news = {2,5};
        so.insert(ints, news);
    }
}
