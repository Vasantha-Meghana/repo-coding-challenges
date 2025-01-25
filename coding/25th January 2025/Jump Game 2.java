//Jump Game 2
class Solution 
{
    public int jump(int[] nums) 
    {
        int i = 0, j = 0, c = 0;
        for(int i1 = 0; i1 < nums.length - 1; i1++)
        {
            j = Math.max(j, i1 + nums[i1]);
            if(i1 == i)
            {
                c++;
                i = j;
            }
        }
        return c;
    }
}
