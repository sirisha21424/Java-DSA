import java.util.*;
class Solution {
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visit=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++)
        {   if(visit[i]==0)
            {   dfs(i,adj,visit,st);
            }
        }
        int[] ans=new int[V];
        int j=0;
        while(!st.isEmpty())
        {   ans[j++]=st.pop();
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {   for(int l=0;l<adj.get(i).size();l++)
            {   int a=adj.get(i).get(l);
                list.get(a).add(i);
            }
        }
        int count=0;
        int[] visited=new int[V];
        for(int i=0;i<V;i++)
        {   int x=ans[i];
            if(visited[x]!=1)
            {   count++;
                bfs(x,visited,list);
            }
        }
        return count;
    
    }
    public void bfs(int n,int[] visited,ArrayList<ArrayList<Integer>> list)
    {   Queue<Integer> q=new LinkedList<>();
        q.offer(n);
        visited[n]=1;
        while(!q.isEmpty())
        {   int node=q.poll();
            for(int i=0;i<list.get(node).size();i++)
            {   int k=list.get(node).get(i);
                if(visited[k]!=1)
                {   visited[k]=1;
                    q.offer(k);
                }
            }
        }
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] visit,Stack<Integer> st)
    {   visit[node]=1;
        for(int i=0;i<adj.get(node).size();i++)
        {   int k=adj.get(node).get(i);
            if(visit[k]==0)
            {   dfs(k,adj,visit,st);
            }
        }
        st.push(node);
    }
}
