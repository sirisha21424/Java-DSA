import java.util.*;
class Solution {
    public int wordLadderLength(String startWord, String targetWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++)
        {   set.add(wordList.get(i));
        }
        if(!set.contains(targetWord))
        {   return 0;
        }
        Queue<String> q=new LinkedList<>();
        q.offer(startWord);
        int steps=1;
        while(!q.isEmpty())
        {   int size=q.size();
            for(int i=0;i<size;i++)
            {   String w=q.poll();
                if(w.equals(targetWord))
                {   return steps;
                }
                char[] arr=w.toCharArray();
                for(int j=0;j<arr.length;j++)
                {   char original=arr[j];
                    for(char ch='a';ch<='z';ch++)
                    {   arr[j]=ch;
                        String newword=new String(arr);
                        if(set.contains(newword))
                        {   q.offer(newword);
                            set.remove(newword);
                        }
                    }
                    arr[j]=original;
                }
            }
            steps++;
        }
        return 0;
        
     
    }
}