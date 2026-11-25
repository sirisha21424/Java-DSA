class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int j=0;
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {   char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
            {   count++;
            }
            if(i-j+1==k)
            {   maxcount=Math.max(maxcount,count);
                char left = s.charAt(j);
                if (left == 'a' || left == 'e' || left == 'i' ||
                    left == 'o' || left == 'u') 
                {
                    count--;
                }
                j++;
            }
        }
        
        return maxcount;
        
    }
}