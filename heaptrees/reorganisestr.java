import java.util.*;
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {   map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Character,Integer>entry:map.entrySet())
        {   pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        StringBuilder sb=new StringBuilder();
        int[] prev=null;
        while(pq.size()>0)
        {   int[] curr=pq.poll();
            sb.append((char)curr[0]);
            curr[1]--;
            if(prev!=null && prev[1]>0)
            {   pq.offer(prev);
            }
            prev=curr;
        }
        if(sb.length()!=s.length())
        {   return "";
        }
        return sb.toString();
    
            
    }
}