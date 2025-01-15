//Valid Palindrome of a String
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String str = "";
        s = s.toLowerCase();
        for(String word : s.split(" "))
        {
            for(char ch : word.toCharArray())
            {
                if(Character.isLetterOrDigit(ch))
                    str = str + ch;
            }
        }
        int i = 0, j = str.length() - 1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
