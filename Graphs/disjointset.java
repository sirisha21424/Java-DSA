class DisjointSet {
    int[] parent;
    int[] rank;
    int[] size;
    public DisjointSet(int n) {
      parent=new int[n];
      rank=new int[n];
      size=new int[n];
      for(int i=0;i<n;i++)
      { parent[i]=i;
        rank[i]=0;
        size[i]=1;
       }
    }
    private int findparent(int u)
    {   if(parent[u]==u)
            return u;
        parent[u]=findparent(parent[u]);
        return parent[u];
    }


    public boolean find(int u, int v) {
        return findparent(u)==findparent(v);
    }

    public void unionByRank(int u, int v) {
        int pu=findparent(u);
        int pv=findparent(v);
        if(pu==pv)
            return;
        if(rank[pu]>rank[pv])
        {   parent[pv]=pu;
        }
        else if(rank[pv]>rank[pu])
        {   parent[pu]=pv;
        }
        else
        {   parent[pv]=pu;
            rank[pu]++;
        }

        
    }

    public void unionBySize(int u, int v) {
        int pu = findparent(u);
        int pv = findparent(v);

        if (pu == pv) {
            return;
        }
        if(size[pu]>size[pv])
        {   parent[pv]=pu;
            size[pv]+=size[pu];
        }
        else
        {   parent[pu]=pv;
            size[pu]+=size[pv];
        }

        
    }
}
