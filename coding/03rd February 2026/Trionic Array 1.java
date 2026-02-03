//Trionic Array 1
class Solution 
{
    public boolean isTrionic(int[] nums) 
    {
        if(nums.length <= 3)
            return false;
        int p = 0, q = 0, k = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] >= nums[i])
            {
                p = i - 1;
                break;
            }
            p = i;
        }
        for(int i = p + 1; i < nums.length; i++)
        {
            if(nums[i - 1] <= nums[i])
            {
                q = i - 1;
                break;
            }
            q = i;
        }
        for(int i = q + 1; i < nums.length; i++)
        {
            if(nums[i - 1] >= nums[i])
            {
                k = i - 1;
                break;
            }
            k = i;
        }
        return p > 0 && q > p && k == nums.length - 1;
    }
}
