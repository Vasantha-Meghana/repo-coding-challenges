//Length of Last Word
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        int i = s.length() - 1;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;
        int result = 0;
        while(i >= 0 && s.charAt(i) != ' ')
        {
            result++;
            i--;
        }
        return result;
    }
}

/*
class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }
}
*/
