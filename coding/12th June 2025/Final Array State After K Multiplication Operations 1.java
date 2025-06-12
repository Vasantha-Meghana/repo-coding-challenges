//Final Array State After K Multiplication Operations 1
class Solution 
{
    public int[] getFinalState(int[] nums, int k, int multiplier) 
    {
        for(int i = 0; i < k; i++)
        {
            int min = nums[0], ind = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] < min)
                {
                    min = nums[j];
                    ind = j;
                }
            }
            nums[ind] = min * multiplier;
        } 
        return nums;   
    }
}
