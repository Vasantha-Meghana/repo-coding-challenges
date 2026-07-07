//Concatenate Non-Zero Digits and Multiply by Sum 1
class Solution 
{
    public long sumAndMultiply(int n) 
    {
        long sum = 0, num = 0;
        String rev = new StringBuilder(String.valueOf(n)).reverse().toString();
        int r = Integer.parseInt(rev);
        while(r > 0)
        {
            int r1 = r % 10;
            if(r1 != 0)
            {
                sum += r1;
                num = num * 10 + r1;
            }
            r = r / 10;
        }
        return num * sum;
    }
}
