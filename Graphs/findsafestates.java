import java.util.*;
class Solution {
    public int[] eventualSafeNodes(int V, int[][] adj) {
       int n=adj.length;
        List<List<Integer>> reverse=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   reverse.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {   for(int j=0;j<adj[i].length;j++)
            {   int k=adj[i][j];
                reverse.get(k).add(i);
            }
        }
        int[] indegree=new int[n];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<reverse.get(i).size();j++)
            {   int k=reverse.get(i).get(j);
                indegree[k]++;
            }
        }
        List<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {   if(indegree[i]==0)
            {   q.offer(i);
            }
        }
        while(!q.isEmpty())
        {   int node=q.poll();
            list.add(node);
            for(int j=0;j<reverse.get(node).size();j++)
            {   int k=reverse.get(node).get(j);
                indegree[k]--;
                if(indegree[k]==0)
                {   q.offer(k);
                }
            }
        }
        Collections.sort(list);
       int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
        ans[i] = list.get(i);
    }

    return ans;
    }
        
}