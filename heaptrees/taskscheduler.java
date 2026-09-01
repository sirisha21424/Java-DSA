class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq=new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxfreq=freq[0];
        for(int i=1;i<26;i++)
        {   if(freq[i]>maxfreq)
            {   maxfreq=freq[i];
            }
        }
        int count=0;
        for(int i=0;i<26;i++)
        {   if(freq[i]==maxfreq)
            {   count++;
            }
        }
        int len=(maxfreq-1)*(n+1)+count;
        return Math.max(len,tasks.length);

        
    }
}