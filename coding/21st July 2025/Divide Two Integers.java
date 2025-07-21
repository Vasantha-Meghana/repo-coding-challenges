//Divide Two Integers
class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;
        if(divisor == -1)
            return -dividend;
        int result = 0;
        long temp1 = Math.abs((long)dividend);
        long temp2 = Math.abs((long)divisor);
        while(temp1 >= temp2)
        {
            temp1 = temp1 - temp2;
            result++;
        }
        if(dividend < 0 && divisor < 0)
            return result;
        else if(dividend < 0 ^ divisor < 0)
            return -result;
        return result;
    }
}
