//Product of Array Except Self
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {                                                         
        int prod = 1, zeros = 0;
        boolean containsZero = false;
        for(int ele : nums)
        {
            if(ele == 0)
            {
                containsZero = true;
                zeros++;
            }
            else
                prod *= ele;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(containsZero)
            {
                if(nums[i] == 0 && zeros == 1)
                    nums[i] = prod;
                else
                    nums[i] = 0;
            }
            else
                nums[i] = prod / nums[i];
        }
        return nums;   
    }
}
