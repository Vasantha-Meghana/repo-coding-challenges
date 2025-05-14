//Maximum Ascending Subarray sum
class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int s = nums[0];
        int max = s;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] < nums[i])
                s += nums[i];
            else
                s = nums[i];
            if(s > max)
                max = s;
        }
        return max;
    }
}
