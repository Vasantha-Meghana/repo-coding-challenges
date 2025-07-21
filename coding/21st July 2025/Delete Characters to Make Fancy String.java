//Delete Characters to Make Fancy String
class Solution 
{
    public String makeFancyString(String s) 
    {
        StringBuilder result = new StringBuilder();
        int c = 0;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
                c++;
            else
                c = 0;
            if(c < 2)
                result.append(s.charAt(i - 1));
        }
        result.append(s.charAt(s.length() - 1));
        return result.toString();
    }
}
