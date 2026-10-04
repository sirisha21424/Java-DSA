import java.util.*;
class Solution {
    public String findOrder(String [] dict, int N, int K) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<K;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<dict.length -1;i++)
        {   String s1=dict[i];
            String s2=dict[i+1];
            int n=Math.min(s1.length(),s2.length());
            for(int j=0;j<n;j++)
            {   if(s1.charAt(j)!=s2.charAt(j))
                {   int l=s1.charAt(j)-'a';
                    int m=s2.charAt(j)-'a';
                    list.get(l).add(m);
                    break;
                }
            }
        }
        int[] indegree=new int[K];
        for(int i=0;i<K;i++)
        {   for(int j=0;j<list.get(i).size();j++)
            {   int k=list.get(i).get(j);
                indegree[k]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<K;i++)
        {   if(indegree[i]==0)
            {   q.offer(i);
            }
        }
        while(!q.isEmpty())
        {   int k=q.poll();
            l.add(k);
            for(int i=0;i<list.get(k).size();i++)
            {   int f=list.get(k).get(i);
                indegree[f]--;
                if(indegree[f]==0)
                {   q.offer(f);
                }
            }
        }
        StringBuilder sb=new StringBuilder<>();
        for(int i=0;i<l.size();i++)
        {   char c=(char)(l.get(i)+'a');
            sb.append(c);
        }
        return sb.toString();

        



    }
}