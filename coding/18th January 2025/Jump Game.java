//Jump Game
class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int ind = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i > ind)
                return false;
            if(i + nums[i] > ind)
                ind = i + nums[i];
            if(ind >= nums.length - 1)
                return true;
        }
        return false;
    }
}
