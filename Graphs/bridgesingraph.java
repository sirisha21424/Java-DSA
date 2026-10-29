import java.util.*;
class Solution {
    int timer = 1;

    public List<List<Integer>> criticalConnections(
        int n, List<List<Integer>> connections) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < connections.size(); i++) {
            int u = connections.get(i).get(0);
            int v = connections.get(i).get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] tin = new int[n];
        int[] low = new int[n];

        List<List<Integer>> bridges = new ArrayList<>();

        dfs(0, -1, adj, tin, low, bridges);

        return bridges;
    }

    void dfs(int u, int parent, List<List<Integer>> adj,
             int[] tin, int[] low,
             List<List<Integer>> bridges) {

        tin[u] = low[u] = timer;
        timer++;

        for (int i = 0; i < adj.get(u).size(); i++) {
            int v = adj.get(u).get(i);

            if (v == parent) {
                continue;
            }

            if (tin[v] == 0) {
                dfs(v, u, adj, tin, low, bridges);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > tin[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            } else {
                low[u] = Math.min(low[u], tin[v]);
            }
        }
    }
}
