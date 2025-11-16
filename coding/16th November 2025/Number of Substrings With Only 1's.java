class Solution 
{
    public int numSub(String s) 
    {
        long ones = 0, total = 0, mod = 1000000007;
        for(char ch : s.toCharArray())
        {
            if(ch == '1')
                ones++;
            else
                ones = 0;
            total = (total + ones) % mod;
        }
        return (int) total;
    }
}
