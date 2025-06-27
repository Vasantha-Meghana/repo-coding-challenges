//Repeated Substring Pattern
class Solution 
{
    public boolean repeatedSubstringPattern(String s) 
    {
        for(int i = 1; i <= s.length() / 2; i++)
        {
            if(s.length() % i == 0 && s.substring(0, i).repeat(s.length() / i).equals(s))
                return true;
        }
        return false;
    }
}
