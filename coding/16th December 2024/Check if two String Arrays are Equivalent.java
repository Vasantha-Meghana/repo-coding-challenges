//Check if two String Arrays are Equivalent
class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String w1 = "";
        String w2 = "";
        for(String s1 : word1)
            w1 = w1 + s1;
        for(String s2 : word2)
            w2 = w2 + s2;
        return w1.equals(w2);
    }
}