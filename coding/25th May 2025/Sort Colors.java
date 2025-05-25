//Sort Colors
class Solution 
{
    public void sortColors(int[] nums) 
    {
        int z = 0, o = 0, t = 0;
        for(int ele : nums)
        {
            if(ele == 0)
                z++;
            else if(ele == 1)
                o++;
            else
                t++;
        }
        int ind = 0;
        for(int i = 0; i < z; i++)
        {
            nums[ind] = 0;
            ind++;
        }
        for(int i = 0; i < o; i++)
        {
            nums[ind] = 1;
            ind++;
        }
        for(int i = 0; i < t; i++)
        {
            nums[ind] = 2;
            ind++;
        }
    }
}
