//Sign of the Product of an Array
class Solution 
{
    public int arraySign(int[] nums) 
    {
        int p = 1;
        for(int ele : nums)
        {
            if(ele > 0)
                p *= 1;
            else if(ele < 0)
                p *= -1;
            else
                return 0;
        }
        if(p > 0)
            return 1;
        return -1;
    }
}
