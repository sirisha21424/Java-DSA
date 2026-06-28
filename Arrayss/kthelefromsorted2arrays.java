class Solution {
    public int kthElement(int[] a, int[] b, int k) {
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m)
        {   if(a[i]>b[j])
            {   count++;
                if(count==k)
                {   return b[j];
                }
                j++;
            }
            else
            {  count++;
                if(count==k)
                {   return a[i];
                }
                i++;
            }

        }
        while(i<n)
        {   if(count==k)
            {   return a[i];
            }
            i++;
        }
        while(j<m)
        {   if(count==k)
            {   return b[j];
            }
            j++;
        }
        return -1;
      
    }
}