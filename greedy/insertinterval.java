import java.util.*;
class Solution {
    public int[][] insertNewInterval(int[][] Intervals, int[] newInterval) {
        //your code goes here
         ArrayList<int[]> ans = new ArrayList<>();
        int i = 0;
        int n = Intervals.length; 
        while (i < n && Intervals[i][1] < newInterval[0]) 
        { ans.add(Intervals[i]); 
          i++;
        }  
        while (i < n && Intervals[i][0] <= newInterval[1]) 
        { newInterval[0] = Math.min(newInterval[0], Intervals[i][0]);
          newInterval[1] = Math.max(newInterval[1], Intervals[i][1]);
          i++; 
        }  
        ans.add(newInterval); 
        while (i < n)
        { ans.add(Intervals[i]);
          i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}