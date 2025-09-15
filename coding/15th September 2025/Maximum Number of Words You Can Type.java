//Maximum Number of Words You Can Type
class Solution 
{
    public int canBeTypedWords(String text, String brokenLetters) 
    {
        int result = 0;
        String[] arr = text.split(" ");
        for(String str : arr)
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(brokenLetters.contains(str.charAt(i) + ""))
                    break;
                else if(i == str.length() - 1)
                    result++;
            }
        }
        return result;
    }
}
