//Number Complement
class Solution 
{
    public int findComplement(int num) 
    {
        StringBuilder binary = new StringBuilder();
        while(num > 0)
        {
            int r1 = (num % 2 == 0) ? 1 : 0;
            binary.append(r1);
            num = num / 2;
        }
        int base = 1, res = 0;
        for (int i = 0; i < binary.length(); i++) 
        {
            if (binary.charAt(i) == '1') 
                res += base;
            base = base * 2;
        }
        return res;
    }
}
