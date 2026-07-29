class Solution {
    public int kDistinctChar(String s, int k) {
        //your code goes here
        int maxlen=0;
        int l=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {   map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.size()>k)
            {   map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) 
                {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}