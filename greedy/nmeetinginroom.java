class Solution {
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
       int last=0;
       int count=0;
       for(int i=0;i<start.length;i++)
       {    
            if(start[i]>last)
            {   count++;
                last=end[i];
            }
       }
       return count;
            
    }
}
