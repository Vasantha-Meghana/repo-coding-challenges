//String to Integer(atoi)
class Solution 
{
    public int myAtoi(String s) 
    {
        long result = 0;
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' ')
            i++;
        if(i == s.length())   return 0;
        int sign = 1;
        if(s.charAt(i) == '-' || s.charAt(i) == '+')
        {
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i)))
        {
            int n = s.charAt(i) - '0';
            result = result * 10 + n;
            i++;
            if (sign == 1 && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) (sign * result);
    }
}
