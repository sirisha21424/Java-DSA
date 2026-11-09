class Solution {
    public boolean detectCapitalUse(String word) {
        int u=0;
        int l=0;
        for(int i=0;i<word.length();i++)
        {   char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {   u++;
            }
            else
            {   l++;
            }
            
        }
        if(u==word.length()||l==word.length())
        {   return true;
        }
        if(u==1 && l==word.length()-1)
        {   if(Character.isUpperCase(word.charAt(0)))
                return true;
        }
        return false;
        
    }
}