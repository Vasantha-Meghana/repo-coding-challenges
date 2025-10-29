//Smallest Number With all Set Bits
class Solution 
{
    public int smallestNumber(int n) 
    {
        int c = 0;
        while(n > 0)
        {
            c++;
            n /= 2;
        }
        int result = (int)Math.pow(2, c);
        return result - 1;
    }
}
