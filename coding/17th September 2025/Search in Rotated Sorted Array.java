//Search in Rotated Sorted Array
class Solution 
{
    public int search(int[] nums, int target) 
    {
        int i = 0;
        for(i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] > nums[i])
                break;
        }
        if(target > nums[0])
        {
            for(int j = 1; j <= i - 1; j++)
            {
                if(nums[j] == target)
                    return j;
            }
        }
        else if(target < nums[0])
        {
            for(int j = i; j < nums.length; j++)
            {
                if(nums[j] == target)
                    return j;
            }
        }
        else
            return 0;
        return -1;
    }
}
