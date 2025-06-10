//Count of Matches in Tournament
class Solution 
{
    public int numberOfMatches(int n) 
    {
        int total = 0;
        while(n > 1)
        {
            if(n % 2 == 0)
            {
                n = n / 2;
                total += n;
            }
            else
            {
                n = ((n - 1) / 2) + 1;
                total += n - 1;
            }
        }
        return total;
    }
}
