//Valid Word
class Solution 
{
    public boolean isValid(String word) 
    {
        if(word.length() < 3)   return false;
        int v = 0, c = 0;
        for(char ch : word.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                char ch1 = Character.toLowerCase(ch);
                if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
                    v++;
                else
                    c++;
            }
            else if(!Character.isDigit(ch))
                return false;
        }
        return c > 0 && v > 0;
    }
}
