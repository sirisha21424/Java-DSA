class Solution {
    int[] parent;
    int[] size;
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        parent=new int[n*m];
        size=new int[n*m];
        int total=n*m;
        for (int i = 0; i < total; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1)
                {   int node=i*m+j;
                    for(int a=i-1;a<=i+1;a++)
                    {   for(int b=j-1;b<=j+1;b++)
                        {   if(a>=0 && a<n && b>=0 && b<m &&(a==i||b==j))
                            {   if(grid[a][b]==1)
                                {   int neighbour=a*m+b;
                                    union(node,neighbour);
                                }
                            }
                        }
                    }
                }
            }
        }
        int maxcount = 0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1)
                {   int x=i*m+j;
                    maxcount=Math.max(maxcount,size[find(x)]);
                }
            }
        }
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==0)
                {   Set<Integer> parents=new HashSet<>();
                    int count=1;
                    for(int x=i-1;x<=i+1;x++)
                    {   for(int y=j-1;y<=j+1;y++)
                        {   if(x>=0 && x<n && y>=0 && y<m &&(x==i||y==j) && grid[x][y]==1)
                            {   int p=find(x*m+y);
                                if (parents.add(p)) {
                                    count += size[p];
                                }
                            }
                        }
                    }
                    maxcount = Math.max(maxcount, count);

                }
            }
        }
        return maxcount;

        
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
