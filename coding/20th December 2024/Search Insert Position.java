//Search Insert Position
class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int ind = 0;
        while(ind < nums.length)
        {
            if(nums[ind] < target)
                ind++;
            else
                break;
        }
        return ind;
    }
}