//Count the Digits That Divide a Number
class Solution 
{
    public int countDigits(int num) 
    {
        int count = 0;
        int original = num;
        while(num > 0)
        {
            int r = num % 10;
            if(original % r == 0)
                count++;
            num = num / 10;
        }
        return count;
    }
}
