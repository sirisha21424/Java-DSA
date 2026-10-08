import java.util.*;
class Solution {
    public int MinimumEffort(List<List<Integer>> heights) {
        int n = heights.size();
        int m = heights.get(0).size();

        int[][] visited = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                visited[i][j] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0});
        visited[0][0] = 0;

        while(!pq.isEmpty()) {

            int[] curr = pq.poll();

            int effort = curr[0];
            int r = curr[1];
            int c = curr[2];

            if(r == n - 1 && c == m - 1) {
                return effort;
            }

            for(int i = r - 1; i <= r + 1; i++) {
                for(int j = c - 1; j <= c + 1; j++) {

                    if(i >= 0 && i < n &&
                       j >= 0 && j < m &&
                       (i == r || j == c)) {

                        int edge = Math.abs(
                            heights.get(r).get(c) -
                            heights.get(i).get(j)
                        );

                        int newEffort = Math.max(effort, edge);

                        if(newEffort < visited[i][j]) {

                            visited[i][j] = newEffort;

                            pq.offer(new int[]{
                                newEffort, i, j
                            });
                        }
                    }
                }
            }
        }

        return 0;

        
    }
}
