import java.util.*;
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)
            return -1;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++)
        {   int u=connections[i][0];
            int v=connections[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        int[] visited=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {   if(visited[i]!=1)
            {   count++;
                visited[i]=1;
                Queue<Integer> q=new LinkedList<>();
                q.offer(i);
                while(!q.isEmpty())
                {   int node=q.poll();
                    for(int j=0;j<list.get(node).size();j++)
                    {   int k=list.get(node).get(j);
                        if(visited[k]!=1)
                        {   visited[k]=1;
                            q.offer(k);
                        }
                    }
                }
            }
            
        }
        return count-1;
        
    }
}