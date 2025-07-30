//Longest Subarray With Maximum Bitwise AND
class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return 0;
        int max = 0;
        for(int num : nums)
        {
            if(num > max)
                max = num;
        }
        int maxLen = 0;
        int curr = 0;
        for(int num : nums)
        {
            if(num == max)
                curr++;
            else
            {
                maxLen = Math.max(maxLen, curr);
                curr = 0;
            }
        }
        return Math.max(maxLen, curr);
    }
}
