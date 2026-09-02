import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Max heap
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!map.get(a).equals(map.get(b))) {
                    return Integer.compare(map.get(b), map.get(a));
                }

                return a.compareTo(b);
            }
        );

        // Insert all unique words
        for (String word : map.keySet()) {
            pq.offer(word);
        }

        List<String> ans = new ArrayList<>();

        // Get top k
        for (int i = 0; i < k; i++) {
            ans.add(pq.poll());
        }

        return ans;
    }
}