//Longest Uncommon Subsequence 1
class Solution 
{
    public int findLUSlength(String a, String b) 
    {
        if(a.equals(b))
            return -1;
        if(a.length() > b.length())
            return a.length();
        return b.length();
    }
}
