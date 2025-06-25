//Convert Number to Hexadecimal
class Solution 
{
    public String toHex(int num) 
    {
        if(num == 0)   return "0";
        String result = "";
        String hex = "0123456789abcdef";
        for(int i = 0; i < 8 && num != 0; i++)
        {
            int r = num % 16;
            if(r < 0)
                r += 16;
            result = hex.charAt(r) + result;
            num = (num - r) / 16;
        }
        return result;
    }
}
