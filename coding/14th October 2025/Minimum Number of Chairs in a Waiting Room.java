// Minimum Number of Chairs in a Waiting Room
class Solution 
{
    public int minimumChairs(String s) 
    {
        int c = 0, max = 0;
        for(int ch : s.toCharArray())
        {
            if(ch == 'E')
                c++;
            else
                c--;
            max = Math.max(c, max);
        }
        return max;
    }
}
