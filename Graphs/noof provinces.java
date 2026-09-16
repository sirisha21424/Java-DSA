class Solution {
    public int numProvinces(int[][] adj) {
        int n=adj.length;
        int count=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {   if(!visited[i])
            {   count++;
                visited[i]=true;
                bfs(i,visited,adj);
            }
        }
        return count;
        
    }
    private void bfs(int node,boolean[] visited,int[][] adj)
    {   visited[node]=true;
        int n=adj.length;
        for(int j=0;j<n;j++)
        {   if(!visited[j] && adj[node][j]==1)
            {   visited[j]=true;
                bfs(j,visited,adj);
            }
        }
    }
}

