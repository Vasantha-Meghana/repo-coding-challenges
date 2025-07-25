//Maximum Unique Subarray Sum After Deletion
class Solution 
{
    public int maxSum(int[] nums) 
    {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        if(nums[nums.length - 1] < 0)   return nums[nums.length - 1];
        int result = 0, i = nums.length - 1;
        while(i >= 0 && nums[i] > 0)
        {
            if(!set.contains(nums[i]))
                result += nums[i];
            set.add(nums[i]);
            i--;
        }
        return result;
    }
}
