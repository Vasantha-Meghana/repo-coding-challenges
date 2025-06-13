//Single Element in a Sorted Array
class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int sum = 0;
        for(int ele : nums)
            sum ^= ele;
        return sum;
    }
}
