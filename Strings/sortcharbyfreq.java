import java.util.*;
class Solution {    
    public List<Character> frequencySort(String s) {
        // Your code goes here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {   map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list =new ArrayList<>(map.entrySet());
             list.sort((a, b) -> {

            if (b.getValue() != a.getValue()) {
                return b.getValue() - a.getValue();
            }

            return Character.compare(a.getKey(), b.getKey());
        });
        List<Character> l=new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : list) 
        {   l.add(entry.getKey());
        }
        return l;

    }
}