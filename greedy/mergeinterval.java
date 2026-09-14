import java.util.*;
class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        intervals.sort((a, b) -> a.get(0) - b.get(0));

        List<List<Integer>> list = new ArrayList<>();

        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {

            int currentStart = intervals.get(i).get(0);
            int currentEnd = intervals.get(i).get(1);
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }
            else {
                list.add(Arrays.asList(start, end));

                start = currentStart;
                end = currentEnd;
            }
        }
        list.add(Arrays.asList(start, end));

        return list;
    }
}    
}
