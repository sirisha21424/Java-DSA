import java.util.*;
class Solution {
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int[] visited=new int[V];
        int[] ans=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++)
        {   if(visited[i]!=1)
            {   dfs(i,adj,visited,st);
            }
        }
        int j=0;
        while(!st.isEmpty())
        {   ans[j++]=st.pop();
        }
        return ans;
        
    }
    public void dfs(int node,List<List<Integer>> adj,int[] visited,Stack<Integer> st)
    {   visited[node]=1;
        for(int i=0;i<adj.get(node).size();i++)
        {   int k=adj.get(node).get(i);
            if(visited[k]!=1)
            {   dfs(k,adj,visited,st);
            }
        }
        st.push(node);
    }
}