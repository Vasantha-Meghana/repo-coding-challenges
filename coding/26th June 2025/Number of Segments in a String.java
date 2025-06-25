//Number of Segments in a String
class Solution 
{
    public int countSegments(String s) 
    {
        s = s.trim();
        if(s.equals(""))   return 0;
        int count = 1;
        for(int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
                count++;
        }
        return count;
    }
}
