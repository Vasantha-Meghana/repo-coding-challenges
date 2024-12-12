//Merge Strings Alternatively
class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int i1 = 0, i2 = 0;
        String res = "";
        while(i1 < word1.length() && i2 < word2.length())
        {
            res = res + word1.charAt(i1);
            res = res + word2.charAt(i2);
            i1++;
            i2++;
        }
        while(i1 < word1.length())
        {
            res = res + word1.charAt(i1);
            i1++;
        }
        while(i2 < word2.length())
        {
            res = res + word2.charAt(i2);
            i2++;
        }
        return res;
    }
}
