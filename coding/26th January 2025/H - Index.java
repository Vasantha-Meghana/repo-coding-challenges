//H - Index
class Solution 
{
    public int hIndex(int[] citations) 
    {
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++)
            if(citations[i] >= citations.length - i)
                return citations.length - i;
        return 0;
        /*int l = 0, r = citations.length;
        while(l < r)
        {
            int mid = (l + r + 1) / 2;
            int c = 0;
            for(int i = 0; i < citations.length; i++)
                if(citations[i] >= mid)
                    c++;
            if(c >= mid)
                l = mid;
            else
                r = mid - 1;
        }
        return l;
        */
    }
}
