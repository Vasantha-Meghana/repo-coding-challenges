//GCD of Odd and Even Sums
class Solution {
    int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int o = 1, e  = 2, se = 0, so = 0, i = 0;
        while(i < n)
        {
            so += o;
            se += e;
            o += 2;
            e += 2;
            i++;
        }
        return gcd(so, se);
    }
}
