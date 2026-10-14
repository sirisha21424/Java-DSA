import java.util.*;
class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int m=edges.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<n;j++)
            {   arr[i][j]=-1;
            }
        }
        for(int i=0;i<n;i++)
        {   arr[i][i]=0;
        }
        for(int i=0;i<m;i++)
        {   int a=edges[i][0];
            int b=edges[i][1];
            int w=edges[i][2];
            arr[a][b]=w;
            arr[b][a]=w;
        }
        for(int k=0;k<n;k++)
        {   for(int i=0;i<n;i++)
            {   for(int j=0;j<n;j++)
                {   if(arr[i][k]!=-1 && arr[k][j]!=-1)
                    {   if(arr[i][j]==-1)
                        {   arr[i][j]=arr[i][k]+arr[k][j];
                        }
                        else
                        {   arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                        }
                        

                    }
                }
            }
        }
        int maxcount=Integer.MAX_VALUE;
        int city=-1;
        for(int i=0;i<n;i++)
        {   int count=0;
            for(int j=0;j<n;j++)
            {   if(arr[i][j]!=-1 && i!=j && arr[i][j]<=distanceThreshold)
                {   count++;
                }
            }
            if(count<=maxcount)
            {   maxcount=count;
                city=i;
            }
        }
        return city;
        
        
    }
}