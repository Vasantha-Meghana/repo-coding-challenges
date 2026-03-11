//Complement of Base 10 Integer
class Solution 
{
    public int bitwiseComplement(int n) 
    {
        String bin = Integer.toBinaryString(n);
        int res = 0;
        for(char ch : bin.toCharArray())
        {
            if(ch == '0')
                res = (res * 2) + 1;
            else
                res = res * 2;
        }
        return res;
    }
}
