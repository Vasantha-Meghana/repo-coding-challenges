//Detect Capital
class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int c = 0, ind = word.length() - 1;
        for(int i = 0; i < word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                ind = i;
                c++;
            }
        }
        if(c == 0 || ind == 0 || c == word.length())   
            return true;
        return false;
    }
}
