//Minimum Recolors to Get K Consecutive Black Blocks
class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= blocks.length() - k; i++)
        {
            int c = 0;
            for(int j = i; j < i + k; j++)
            {
                if(blocks.charAt(j) == 'W')
                    c++;
            }
            if(c < min)
                min = c;
        }
        return min;
    }
}
