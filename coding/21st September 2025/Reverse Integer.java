//Reverse Integer
class Solution 
{
    public int reverse(int x) 
    {
        int temp = Math.abs(x);
        StringBuilder sb = new StringBuilder(Integer.toString(temp));
        sb = sb.reverse();
        String str = sb.toString();
        try
        {
           int result = Integer.parseInt(str);
            if(x < 0)
                return -result;
            return result; 
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
    }
}
