//Counting Bits
class Solution 
{
    public int[] countBits(int n) 
    {
        int[] result = new int[n + 1];
        for(int i = 0; i <= n; i++)
        {
           int c = 0, ind = i;
           while(ind > 0)
           {
            if(ind % 2 == 1)
                c++;
            ind = ind / 2;
           }
           result[i] = c; 
        }
        return result;
    }
}
