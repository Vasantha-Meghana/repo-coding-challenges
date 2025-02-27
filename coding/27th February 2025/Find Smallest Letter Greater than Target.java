//Find Smallest Letter Greater than Target
class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int asc1 = (int)target;
        for(char ch : letters)
        {
            int asc2 = (int)ch;
            if(asc2 > asc1)   
                return ch;
        }
        return letters[0];
    }
}
