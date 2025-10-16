//Minimum Operations to Make the Array Increasing
class Solution 
{
    public int minOperations(int[] nums) 
    {
        int temp = nums[0];
        int result = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] <= temp)
            {
                temp++;
                result += (temp - nums[i]);
            }
            else
                temp = nums[i];
        }
        return result;
    }
}
