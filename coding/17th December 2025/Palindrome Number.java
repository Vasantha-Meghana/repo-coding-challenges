//Palindrome Number
class Solution 
{
    public boolean isPalindrome(int n) 
    {
        int res = 0;
        int n1 = n;
        while(n > 0)
        {
            int r = n % 10;
            res = res * 10 + r;
            n = n / 10;
        }
        return res == n1;
    }
}
