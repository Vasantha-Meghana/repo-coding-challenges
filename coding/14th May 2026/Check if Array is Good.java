//Check if Array is Good
class Solution 
{
    public boolean isGood(int[] nums) 
    {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        if(nums.length != max + 1)
            return false;
        for(int i = 0; i < max; i++)
        {
            if(nums[i] != i + 1)
                return false;
        }
        return nums[nums.length - 2] == nums[nums.length - 1];
    }
}
