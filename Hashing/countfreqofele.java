import java.util.*;
class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int num:nums)
      { map.put(num,map.getOrDefault(num,0)+1);
      }
      List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> temp = new ArrayList<>();

            temp.add(entry.getKey());    
            temp.add(entry.getValue());  

            ans.add(temp);
        }

        return ans;

    }
}