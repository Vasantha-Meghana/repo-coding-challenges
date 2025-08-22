//Minimum Operations to Exceed Threshold Value 1
class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int result = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < k)
                result++;
        }
        return result;
    }
}
