import java.util.*;
class Solution {
    int[] parent;
    int[] size;
    public int maxRemove(int[][] stones, int n) {
        int r=-1;
        int c=-1;
        for(int k=0;k<n;k++)
        {   r=Math.max(r,stones[k][0]);
            c=Math.max(c,stones[k][1]);
        }
        parent=new int[r+c+2];
        size=new int[r+c+2];
        for(int i=0;i<r+c+2;i++)
        {   parent[i]=i;
            size[i]=1;
        }
        for(int i=0;i<n;i++)
        {   int row=stones[i][0];
            int col=stones[i][1];
            union(row,r+1+col);
        }
        int components=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {   int row=stones[i][0];
            int p=find(row);
            set.add(p);
           
        }
        int x=set.size();
        return n-x;

        
        
    }
    private int find(int x)
    {   if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    private void union(int u,int v)
    {   int pu = find(u);
        int pv = find(v);

        if (pu == pv) {
            return;
        }

        if (size[pu] < size[pv]) {
            parent[pu] = pv;
            size[pv] += size[pu];
        } else {
            parent[pv] = pu;
            size[pu] += size[pv];
        }

    }
}
