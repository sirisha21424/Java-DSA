import java.util.*;
class Solution {
    public boolean isBipartite(int V, List<List<Integer>> edges) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.size(); i++) {

            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] visited = new int[V];
        int[] color = new int[V];

        Arrays.fill(color, -1);
        for (int i = 0; i < V; i++) {

            if (visited[i] != 1) {

                if (!dfs(i, 0, adj, visited, color)) {
                    return false;
                }
            }
        }

        return true;
    }
    public boolean dfs(int node, int col,
                       List<List<Integer>> adj,
                       int[] visited,
                       int[] color) {

        visited[node] = 1;
        color[node] = col;

        for (int i = 0; i < adj.get(node).size(); i++) {

            int k = adj.get(node).get(i);
            if (visited[k] != 1) {

                if (!dfs(k, 1-col, adj, visited, color)) {
                    return false;
                }
            }
            else if (color[k] == color[node]) {
                return false;
            }
        }

        return true;
    }
}
