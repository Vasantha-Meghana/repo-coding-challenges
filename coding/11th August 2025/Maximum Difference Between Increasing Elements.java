//Maximum Difference Between Increasing Elements
class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        int max = 0;
        for(int i = 0;i < nums.length - 1; i++)
        {
            int j = i + 1, temp = j;
            while(j < nums.length)
            {
                if(nums[i] < nums[j] && nums[temp] < nums[j])
                    temp = j;
                j++;
            }
            if(nums[temp] - nums[i] > max)
                max = nums[temp] - nums[i];
        }
        if(max == 0)
            return -1;
        return max;
    }
}
