//Transform Array by Parity
class Solution 
{
    public int[] transformArray(int[] nums) 
    {
        int[] result = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for(int ele : nums)
        {
            if(ele % 2 == 0)
            {
                result[i] = 0;
                i++;
            }
            else
            {
                result[j] = 1;
                j--;
            }
        }
        return result;
        /*
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                nums[i] = 0;
            }
            else
            {
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
        */
    }
}
