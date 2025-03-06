//Pow(x, n)
class Solution 
{
    public double myPow(double x, int n) 
    {
        double res = 1.0;
        long p = n;
        if(p < 0)
            p = p * -1;
        while(p > 0)
        {
            if(p % 2 == 0)
            {
                x = x * x;
                p = p / 2;
            }
            else
            {
                res = res * x;
                p -= 1;
            }
        }
        if(n < 0)   return 1 / res;
        return res;
    }
}
