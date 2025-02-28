//Max Consecutive Ones
class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int c = 0, max = 0;
        for(int ele : nums)
        {
            if(ele == 1)
            {
                c++;
                if(c > max)
                    max = c;
            }
            else
                c = 0;
        }
        return max;
    }
}
