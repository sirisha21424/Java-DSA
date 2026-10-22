import java.util.*;
class Solution {
    public List<Integer> numOfIslands(int n, int m, int[][] A) {
        int[][] arr=new int[n][m];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<A.length;i++)
        {   int j=A[i][0];
            int k=A[i][1];
            arr[j][k]=1;
            int count=0;
            int[][] visited = new int[n][m];
            for(int k=0;k<n;k++)
            {   for(int j=0;j<m;j++)
                {   if(arr[k][j]==1 && visited[k][j]!=1)
                    {   count++;
                        countislands(arr,visited,k,j);
                    }
                }
            }
            list.add(count);
        }
        return list;
        
    }
   
private void countislands(int[][] arr, int[][] visited, int k, int j) {
    Queue<int[]> q = new LinkedList<>();

    int n = arr.length;
    int m = arr[0].length;

    q.offer(new int[]{k, j});
    visited[k][j] = 1;

    while (!q.isEmpty()) {
        int[] curr = q.poll();

        int r = curr[0];
        int c = curr[1];

        for (int f = r - 1; f <= r + 1; f++) {
            for (int l = c - 1; l <= c + 1; l++) {

                if (f >= 0 && f < n && l >= 0 && l < m
                    && (f == r || l == c)) {

                    if (visited[f][l] != 1 && arr[f][l] == 1) {
                        visited[f][l] = 1;
                        q.offer(new int[]{f, l});
                    }
                }
            }
        }
   }
}

    }
