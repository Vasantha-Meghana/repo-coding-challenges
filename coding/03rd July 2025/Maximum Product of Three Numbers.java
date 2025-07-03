//Maximum Product of Three Numbers
class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int s = nums.length;
        if(nums[0] * nums[1] * nums[s - 1] > nums[s - 3] * nums[s - 2] * nums[s - 1])
            return nums[0] * nums[1] * nums[s - 1];
        return nums[s - 3] * nums[s - 2] * nums[s - 1];
    }
}
