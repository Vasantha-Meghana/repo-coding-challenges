//Counting Words with a Given Prefix
class Solution 
{
    public int prefixCount(String[] words, String pref) 
    {
        int result = 0;
        for(String str : words)
        {
            //if (w.length() >= n && w.startsWith(pref))
            if(str.length() >= pref.length() && pref.equals(str.substring(0, pref.length())))
                result++;
        }
        return result;
    }
}
