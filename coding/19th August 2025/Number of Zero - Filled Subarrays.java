//Number of Zero - Filled Subarrays
class Solution 
{
    public long zeroFilledSubarray(int[] nums) 
    {
        long zeros = 0, sum = 0;
        for(int num : nums)
        {
            if(num == 0)
                zeros++;
            else
                zeros = 0;
            sum += zeros;
        }
        return sum;
    }
}
