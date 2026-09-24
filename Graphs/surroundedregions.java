import java.util.*;
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] visited=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(i==0 || i==n-1 || j==0 || j==m-1)
                {   if(board[i][j]=='O')
                    {   q.offer(new int[]{i,j});
                        visited[i][j]=1;
                    }
                }
            }
        }
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int i=r-1;i<=r+1;i++)
            {   for(int j=c-1;j<=c+1;j++)
                {   if(i>=0 && i<n-1 && j>=0 && j<m-1 && (i==r || j==c))
                    {   if(visited[i][j]!=1 && board[i][j]=='O')
                        {   visited[i][j]=1;
                            q.offer(new int[]{i,j});
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(board[i][j]=='O' && visited[i][j]!=1)
                {   board[i][j]='X';
                }
            }
        }       
    }
}