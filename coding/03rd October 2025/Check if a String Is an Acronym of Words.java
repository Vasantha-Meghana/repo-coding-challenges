//Check if a String Is an Acronym of Words
class Solution 
{
    public boolean isAcronym(List<String> words, String s) 
    {
        if(words.size() != s.length())   return false;
        for(int i = 0; i < words.size(); i++)
        {
            String str = words.get(i);
            if(str.charAt(0) != s.charAt(i))
                return false;
        }
        return true;
    }
}
