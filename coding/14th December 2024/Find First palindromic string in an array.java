//Find First palindromic string in an array
class Solution 
{
    public String firstPalindrome(String[] words) 
    {
        for(String str : words)
        {
            if(isPalindrome(str))
                return str;
        }
        return "";
    }
    public Boolean isPalindrome(String str)
    {
        for(int i = 0, j = str.length() - 1; i<j; i++, j--)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}