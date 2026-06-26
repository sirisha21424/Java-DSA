import java.util.*;
class Solution {
    public boolean isomorphicString(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Character> list=new HashMap<>();
        HashMap<Character,Character> list1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {   char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(list.containsKey(c1))
            {   if(list.get(c1)!=c2)
                {   return false;
                }
            }
            else
            {   list.put(c1,c2);
            }
            
            if(list1.containsKey(c2))
            {   if(list1.get(c2)!=c1)
                {   return false;
                }
            }
                else
                {   list1.put(c2,c1);
                }
            
        }
        return true;
    }
}