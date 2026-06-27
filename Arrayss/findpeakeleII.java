class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat[0].length;
        int n=mat.length;
        int low=0;
        int high=m-1;
        while(low<=high)
        {   int mid=low+(high-low)/2;
            int maxRow=0;
            for (int i = 1; i < n; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                maxRow = i;
            }
            }
            int current=mat[maxRow][mid];
            int left=(mid>0)?mat[maxRow][mid-1]:-1;
            int right=(mid<m-1)?mat[maxRow][mid+1]:-1;
            if(current>left && current>right)
            {   return new int[]{maxRow,mid};
            }
            else if(left>current)
            {   high=mid-1;
            }
            else
            {   low=mid+1;
            }
        }
        return new int[]{-1,-1};
      
    }
}