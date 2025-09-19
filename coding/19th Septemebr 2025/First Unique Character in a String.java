//First Unique Character in a String
class Solution 
{
    public int firstUniqChar(String s) 
    {
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String substr1 = s.substring(i + 1, s.length());
            String substr2 = s.substring(0, i);
            if(!substr1.contains("" + ch) && !substr2.contains("" + ch))
                return i;
        }
        return -1;
    }
}
