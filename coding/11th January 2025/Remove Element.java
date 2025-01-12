//Remove Element
class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int n = nums.length, c = 0;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] != val)
            {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
