class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n = mat.length;
        int m = mat[0].length;

        int i = 0;
        int j = m - 1;
        int ans = -1;

        while (i < n && j >= 0) {
            if (mat[i][j] == 1) {
                ans = i;
                j--;      
            } else {
                i++;      
            }
        }

        return ans;
    }
}
