//Check if Digits Are Equal in String After Operations 1
class Solution 
{
    public boolean hasSameDigits(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        int i = s.length();
        while(i > 2)
        {
            for(int j = 1; j < i; j++)
            {
                int sum = ((sb.charAt(j) - '0') + (sb.charAt(j - 1) - '0')) % 10;
                sb.replace(j - 1, j, sum + "");
            }
            i--;
        }
        return sb.charAt(0) == sb.charAt(1);
    }
}
