//Calculate Money in Leetcode Bank
class Solution 
{
    public int totalMoney(int n) 
    {
        int total = 0;
        for(int i = 0; i < n; i++)
        {
            int temp = (i / 7 + 1) + (i % 7);
            total += temp; 
        }
        return total;
    }
}
