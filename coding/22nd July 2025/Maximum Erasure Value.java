//Maximum Erasure Value
class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        int result = 0, sum = 0, left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right = 0; right < nums.length; right++)
        {
            while(set.contains(nums[right]))
            {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);
            result = Math.max(result, sum);
        }
        return result;
    }
}
