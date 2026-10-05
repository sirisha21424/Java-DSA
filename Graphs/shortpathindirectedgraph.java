import java.util.*;
class Solution {
  public int[] shortestPath(int N, int M, int[][] edges) {
    List<List<int[]>> list=new ArrayList<>();
    for(int i=0;i<N;i++)
    {   list.add(new ArrayList<>());
    }
    for(int i=0;i<edges.length;i++)
    {   int a=edges[i][0];
        int b=edges[i][1];
        int w=edges[i][2];
        list.get(a).add(new int[]{b,w});
    }
    int[] indegree=new int[N];
    for(int i=0;i<N;i++)
    {   for(int j=0;j<list.get(i).size();j++)
        {   int[] curr=list.get(i).get(j);
            int k=curr[0];
            indegree[k]++;
        }
    }
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<N;i++)
    {   if(indegree[i]==0)
        {   q.offer(i);
        }
    }
    int[] arr=new int[N];
    int h=0;
    while(!q.isEmpty())
    {   int node=q.poll();
        arr[h++]=node;
        for(int j=0;j<list.get(node).size();j++)
        {   int[] c=list.get(node).get(j);
            int m=c[0];
            indegree[m]--;
            if(indegree[m]==0)
            {   q.offer(m);
            }
        }
    }
    int[] ans=new int[N];
    int inf=Integer.MAX_VALUE;
    Arrays.fill(ans,inf);
    ans[0]=0;
    for(int i=0;i<N;i++)
    {   int s=arr[i];
        if(ans[s]==inf)
            continue;
        for(int j=0;j<list.get(s).size();j++)
        {   int[] p=list.get(s).get(j);
            int next=p[0];
            int weight=p[1];
            if(ans[s]+weight<ans[next])
            {   ans[next]=ans[s]+weight;
            }
        }
    }
    for(int i=0;i<N;i++)
    {   if(ans[i]==inf)
        {   ans[i]=-1;
        }
    }
    return ans;
}
 
 
}