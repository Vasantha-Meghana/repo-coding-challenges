//Find Minimum Operations to Make All elements Divisible by Three
class Solution 
{
    public int minimumOperations(int[] nums) 
    {
        int count = 0;
        for(int ele : nums)
            if(ele % 3 != 0)
                count++;
        return count;
    }
}
