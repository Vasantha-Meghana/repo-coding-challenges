//Minimum Bit Flips to Convert Number
class Solution 
{
    public int minBitFlips(int start, int goal) 
    {
        int result = 0;
        while(start != 0 && goal != 0)
        {
            int b1 = start % 2;
            int b2 = goal % 2;
            System.out.println(b1 + " " + b2);
            start /= 2;
            goal /= 2;
            if(b1 != b2)
                result++;
        }
        while(start != 0)
        {
            if(start % 2 != 0)
                result++;
            start /= 2;
        }
        while(goal != 0)
        {
            if(goal % 2 != 0)
                result++;
            goal /= 2;
        }
        return result;
    }
}
