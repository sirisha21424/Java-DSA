import java.util.*;
class Solution {
    public List<Integer> replaceWithRank(List<Integer> arr) {
        // Your code goes here
        int n=arr.size();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {   arr1[i]=arr.get(i);
        }
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=0;
        for(int i=0;i<n;i++)
        {   if(!map.containsKey(arr1[i]))
            {   map.put(arr1[i],++rank);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   list.add(map.get(arr.get(i)));
        }
        return list;
    }
}
