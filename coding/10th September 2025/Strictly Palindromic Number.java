//Strictly Palindromic Number
class Solution 
{
    public boolean isStrictlyPalindromic(int n) 
    {
        for(int i = 2; i <= n - 2; i++)
        {
            int temp = n;
            String digits = "";
            while(temp > 0)
            {
                int r = temp % i;
                digits = r + digits;
                temp /= i;
            }
            String rev = new StringBuilder(digits).reverse().toString();
            if(!digits.equals(rev))
                return false;
        }
        return true;
    }
}
