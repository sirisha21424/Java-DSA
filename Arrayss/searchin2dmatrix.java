class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=n*m-1;
        while(low<=high)
        {   int mid=low+(high-low)/2;
            int r=mid/m;
            int c=mid%m;
            if(mat[r][c]==target)
            {   return true;
            }
            else if(mat[r][c]>target)
            {   high=mid-1;
            }
            else
            {   low=mid+1;
            }
        }
        return false;

    }
}
