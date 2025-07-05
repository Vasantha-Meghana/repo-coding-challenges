//Longest Continuous Increasing Subsequence
class Solution 
{
    public int findLengthOfLCIS(int[] nums) 
    {
        int result = 0, count = 0;
        int i = 0, j = 1;
        for(int i1 = 0; i1 < nums.length - 1; i1++)
        {
            if(nums[i1] < nums[i1 + 1])
                count++;
            else 
                count = 0;
            if(count > result)
                result = count;
        }
        return result + 1;
    }
}
