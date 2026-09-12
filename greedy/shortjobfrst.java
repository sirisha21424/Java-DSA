import java.util.*;
class Solution {
    public long solve(int[] bt) {
        //your code goes here
        Arrays.sort(bt);
        long wait=0;
        long tot=0;
        int n=bt.length;
        for(int i=1;i<bt.length;i++)
        {   wait+=bt[i-1];
            tot+=wait;
        }
        return tot/n;
    }
}