//Product of Array Except Self
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {                                                         
        int prod = 1, zeros = 0;
        boolean containsZero = false;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0) 
            {
                containsZero = true;
                zeros++;
            }
            else 
                prod = prod * nums[i];
        } 
        for (int i = 0; i < nums.length; i++)
        {
            if (containsZero)
            {
                if (nums[i] == 0 && nums.length != zeros&& zeros == 1)
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
