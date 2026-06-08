class Solution {
    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> current = new ArrayList<>(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {

            List<Integer> next = intervals.get(i);
            if (next.get(0) <= current.get(1)) {
                current.set(1,
                        Math.max(current.get(1), next.get(1)));
            } else {
                ans.add(current);
                current = new ArrayList<>(next);
            }
        }

        // Add the last interval
        ans.add(current);

        return ans;
    }
}