import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int[] visited=new int[n];
        bfs(0,rooms,visited);
        for(int i=0;i<n;i++)
        {   if(visited[i]!=1)
            {   return false;
            }
        }
        return true;
    }
    public void bfs(int node,List<List<Integer>> rooms,int[] visited)
    {   visited[node]=1;
        for(int i=0;i<rooms.get(node).size();i++)
        {   int k=rooms.get(node).get(i);
            if(visited[k]!=1)
            {   visited[k]=1;
                bfs(k,rooms,visited);
            }
        }
    }
}