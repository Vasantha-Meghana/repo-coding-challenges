//Largest Number At Least Twice of Others
class Solution 
{
    public int dominantIndex(int[] nums) 
    {
        int ind = 0, max = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                ind = i;
            }
        }
        for(int ele : nums)
        {
            if(ele * 2 > max && ele != max)
                return -1;
        }
        return ind;
    }
}
