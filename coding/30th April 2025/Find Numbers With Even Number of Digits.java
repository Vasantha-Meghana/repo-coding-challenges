//Find Numbers With Even Number of Digits
class Solution 
{
    public int findNumbers(int[] nums) 
    {
        int res = 0;
        for(int ele : nums)
        {
            int c = 0;
            while(ele > 0)
            {
                c++;
                ele = ele / 10;
            }
            if(c % 2 == 0)
                res++;
        }
        return res;
    }
}
