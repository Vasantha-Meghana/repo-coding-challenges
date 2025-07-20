//Check Divisibility by Digit Sum and Product
class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int sum = 0, p = 1;
        int num = n;
        while(n > 0)
        {
            int r = n % 10;
            sum += r;
            p *= r;
            n = n / 10;
        }
        return num % (sum + p) == 0;
    }
}©leetcode
