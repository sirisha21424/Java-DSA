class Solution {
    public int balancedStringSplit(String s) {
        int lcount=0;
        int rcount=0;
        int tot=0;
        for(int i=0;i<s.length();i++)
        {   if(s.charAt(i)=='L')
            {   lcount++;
            }
            else
            {   rcount++;
            }
            if(lcount==rcount)
            {   tot++;
                lcount=0;
                rcount=0;
            }
        }
        
        return tot;
    }
}