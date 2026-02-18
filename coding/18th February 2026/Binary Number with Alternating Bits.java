//Binary Number with Alternating Bits
class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
        StringBuilder str = new StringBuilder();
        while(n > 0)
        {
            int r = n % 2;
            n = n / 2;
            str.append(r);
        }
        for(int i = 1; i < str.length(); i++)
        {
            if((str.charAt(i - 1) == str.charAt(i)))
                return false;
        }
        return true;
    }
}
