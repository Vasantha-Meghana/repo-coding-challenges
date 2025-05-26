//Valid Palindrome 2
class Solution 
{
    boolean valid(String s, int i, int j)
    {
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) 
    {
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return valid(s, i + 1, j) || valid(s, i, j - 1);
            i++;
            j--;
        }
        return true;
    }
}
