//Sqrt(x)
class Solution 
{
    public int mySqrt(int x) 
    {
        //return (int)Math.sqrt(x);
        if(x == 0 || x == 1)   return x;
        int l = 1, r = x / 2, res = 0;
        while(l <= r)
        {
            int mid  = (l + r) / 2;
            long val = (long)mid * mid;
            if(val == x)
                return mid;
            else if(val < x)
            {
                res = mid;
                l = mid + 1;
            }
            else
                r = mid - 1;
        }
        return res;
    }
}
