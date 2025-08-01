// Richest Customer Wealth
class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++)
                sum += accounts[i][j];
            max = Math.max(max, sum);
        }
        return max;
    }
}
