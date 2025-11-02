//Find Pivot Index
class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int totalsum = 0,lsum = 0;
        for(int i = 0; i < nums.length; i++)
            totalsum = totalsum + nums[i];
        for(int i = 0; i < nums.length; i++)
        {
            totalsum = totalsum - nums[i];
            if(totalsum == lsum)
                return i;
            lsum = lsum + nums[i];
        }
        return -1;
    }
}
