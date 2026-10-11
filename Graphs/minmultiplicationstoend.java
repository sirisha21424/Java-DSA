import java.util.*;
class Solution {
    public int minimumMultiplications(int[] arr, int start, int end) {
       int[] visited = new int[100000];
        Arrays.fill(visited, -1);

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start, 0});
        visited[start] = 0;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int num = curr[0];
            int count = curr[1];

            if (num == end) {
                return count;
            }

            for (int i = 0; i < arr.length; i++) {
                int next = (num * arr[i]) % 100000;

                if (visited[next] == -1) {
                    visited[next] = count + 1;
                    q.offer(new int[]{next, count + 1});
                }
            }
        }

        return -1;
        
       
    }
}