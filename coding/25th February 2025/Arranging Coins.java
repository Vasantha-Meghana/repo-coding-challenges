//Arranging Coins
class Solution 
{
    public int arrangeCoins(int n) 
    {
        int i = 1;
        while(n > 0)
        {
            i++;
            n = n - i;
        }
        return i - 1;
    }
}
/*class Solution 
{
    public int arrangeCoins(int n) 
    {
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;
            if(sum == n)
                return i;
            if(sum > n)
                return i - 1;
        }
        return 0;
    }
}*/
