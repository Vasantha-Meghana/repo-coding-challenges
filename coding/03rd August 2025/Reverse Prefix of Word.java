// Reverse Prefix of Word
class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        String result = "";
        int i;
        for(i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
                break;
            result = word.charAt(i) + result;
        }
        if(i == word.length())
            return word;
        result = ch + result + word.substring(i + 1, word.length());
        return result;
    }
}
