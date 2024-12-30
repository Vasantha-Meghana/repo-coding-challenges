//Increasing Triplet Subsequence
class Solution 
{
    public boolean increasingTriplet(int[] nums) 
    {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int ele : nums)
        {
            if(ele <= min1)
                min1 = ele;
            else if(ele <= min2)
                min2 = ele;
            else
                return true;
        }
        return false;
    }
}
