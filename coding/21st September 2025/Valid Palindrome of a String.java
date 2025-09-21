//Valid Palindrome of a String
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)))
            {
                char ch1 = Character.toLowerCase(s.charAt(i));
                char ch2 = Character.toLowerCase(s.charAt(j));
                if(ch1 != ch2)
                {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
