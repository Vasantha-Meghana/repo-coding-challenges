//Split a String in Balanced Strings
class Solution 
{
    public int balancedStringSplit(String s) 
    {
        int result = 0, balance = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'R')
                balance++;
            else if(ch == 'L')
                balance--;
            if(balance == 0)
                result++;
        }
        return result;
    }
}
