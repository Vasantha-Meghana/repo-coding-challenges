//Keep Multiplying Found Values by Two
class Solution 
{
    public int findFinalValue(int[] nums, int original) 
    {
        Arrays.sort(nums);
        for(int ele : nums)
        {
            if(ele == original)
                original = ele * 2;
        }
        return original;
    }
}
