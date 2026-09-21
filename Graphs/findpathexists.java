import java.util.*;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       List<List<Integer>> adj = new ArrayList<>();
       for (int i = 0; i < n; i++)
       {    adj.add(new ArrayList<>());
       }
       for (int[] edge : edges) 
       {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return bfs(visited,adj,source,destination);
    }
    public boolean bfs(boolean[] visited,List<List<Integer>> adj,int node,int destination)
    {       if (node == destination) {
            return true;
        }
        visited[node] = true;
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                if (bfs(visited,adj,neighbour, destination))
                {
                    return true;
                }
            }
        }

        return false;

    }
}