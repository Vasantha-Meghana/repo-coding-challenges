//Process String with Special Operations 1
class Solution 
{
    public String processStr(String s) 
    {
        String result = "";
        for(char ch : s.toCharArray())
        {
            if(Character.isLowerCase(ch))
                result = result + ch;
            else if(ch == '*')
            {
                if(result.length() > 0)
                    result = result.substring(0, result.length() - 1);
            }
            else if(ch == '#')
                result = result + result;
            else if(ch == '%')
            {
                String rev = "";
                for(char ch1 : result.toCharArray())
                    rev = ch1 + rev;
                result = rev;
            }
        }
        return result;
    }
}©leetcode
