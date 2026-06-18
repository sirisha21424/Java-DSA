class Solution {
    public List<Integer> count_NGE(int[] arr, int[] indices) {
        // Your code goes here
        List<Integer> list=new ArrayList<>();
        int count=0;
        int n=arr.length;
        int m=indices.length;
        for(int i=0;i<m;i++)
        {   for(int j=indices[i];j<n;j++)
            {   int max=arr[indices[i]];
                if(arr[j]>max)
                {   count++;
                }
            }   
            list.add(count);
            count=0;
        }
        return list;
    }
}
