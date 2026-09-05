import java.util.*;

class Solution {
    public int mostFrequentElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums)
      { map.put(num,map.getOrDefault(num,0)+1);
      }
      int maxKey = -1;
      int maxValue = Integer.MIN_VALUE;

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > maxValue) {
        maxValue = entry.getValue();
        maxKey = entry.getKey();
      }
    }
    return maxKey;
       
    }
}