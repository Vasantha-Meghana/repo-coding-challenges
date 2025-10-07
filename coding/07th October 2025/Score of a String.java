//Score of a String
class Solution 
{
    public int scoreOfString(String s) 
    {
        int result = 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            int ch1 = s.charAt(i) - '0';
            int ch2 = s.charAt(i + 1) - '0';
            result += Math.abs(ch2 -ch1);
        }
        return result;
    }
}
/*
class Solution 
{
    public int scoreOfString(String s) 
    {
        int res = 0;
        for(int i = 0; i < s.length() - 1; i++)
            res += Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1));
        return res;
    }
}
*/
