import java.util.*;
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q=new LinkedList<>();
        int n=image.length;
        int m=image[0].length;
        int oldcolor=image[sr][sc];
        if(oldcolor==color)
            return image;
        image[sr][sc]=color;
        
        q.offer(new int[]{sr,sc});
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while(!q.isEmpty())
        {   int size=q.size();
            for(int i=0;i<size;i++)
            {   int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int j=0;j<directions.length;j++)
                {   int nr=r+directions[j][0];
                    int nc=c+directions[j][1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==oldcolor )
                    {   image[nr][nc]=color;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return image;

        
        
    }
}
