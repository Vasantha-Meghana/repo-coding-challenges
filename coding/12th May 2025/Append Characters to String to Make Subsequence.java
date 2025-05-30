//Append Characters to String to Make Subsequence
class Solution 
{
    public int appendCharacters(String s, String t) 
    {
        int i = 0, j = 0, c = 1;
        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
                j++;
            i++;
        }
        return t.length() - j;
    }
}
