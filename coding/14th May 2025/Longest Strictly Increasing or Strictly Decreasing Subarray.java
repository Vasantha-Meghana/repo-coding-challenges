//Longest Strictly Increasing or Strictly Decreasing Subarray
class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        int res = 1;
        int ic = 1, dc = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] < nums[i])
            {
                ic++;
                dc = 1;
            }
            else if(nums[i - 1] > nums[i])
            {
                ic = 1;
                dc++;
            }
            else
            {
                ic = 1;
                dc = 1;
            }
            res = Math.max(res, Math.max(ic, dc));
        }
        return res;
    }
}
