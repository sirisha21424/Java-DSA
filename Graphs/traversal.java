import java.util.*;
class Solution {

    public List<Integer> dfsOfGraph(int V, List<List<Integer>> edges) {

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for(int i = 0; i < edges.size(); i++) {

            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // DFS
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        dfs(0, visited, adj, result);

        return result;
    }


    private void dfs(int node, boolean[] visited,
                     List<List<Integer>> adj,
                     List<Integer> result) {

        visited[node] = true;
        result.add(node);

        for(int i = 0; i < adj.get(node).size(); i++) {

            int neighbour = adj.get(node).get(i);

            if(!visited[neighbour]) {
                dfs(neighbour, visited, adj, result);
            }
        }
    }


    public List<Integer> bfsOfGraph(int V, List<List<Integer>> edges) {

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Convert edge list to adjacency list
        for(int i = 0; i < edges.size(); i++) {

            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // BFS
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {

            int node = q.poll();

            result.add(node);

            for(int i = 0; i < adj.get(node).size(); i++) {

                int neighbour = adj.get(node).get(i);

                if(!visited[neighbour]) {

                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return result;
    }
}
