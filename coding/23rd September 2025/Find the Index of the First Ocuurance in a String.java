//Find the Index of the First Ocuurance in a String
class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        if(haystack.equals(needle))   return 0;
        int i = 0;
        while(i < haystack.length() - needle.length() + 1)
        {
            if(needle.equals(haystack.substring(i, i + needle.length())))
                return i;
            i++;
        }
        return -1;
    }
}
