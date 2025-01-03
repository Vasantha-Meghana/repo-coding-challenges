//Reverse Bits
public class Solution 
{
    // you need treat n as an unsigned value
    public int reverseBits(int n) 
    {
        int res = 0;
        for(int i = 0; i < 32; i++)
        {
            res = res << 1; //Shift left
            res = res + (n & 1);
            n = n >> 1; //right shift
        }
        return res;
    }
}
