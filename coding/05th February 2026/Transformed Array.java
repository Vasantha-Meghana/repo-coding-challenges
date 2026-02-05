//Transformed Array
class Solution 
{
    public int[] constructTransformedArray(int[] nums) 
    {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int ind;
            if(nums[i] > 0)
            {
                ind = (i + nums[i]) % nums.length;
            }
            else
            {
                ind = (i - Math.abs(nums[i])) % nums.length;
                if (ind < 0)
                    ind += nums.length;
            }
            result[i] = nums[ind];
        }
        return result;
    }
}
/*
class Solution 
{
    public int[] constructTransformedArray(int[] nums) 
    {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int ind = i;
            if(nums[i] > 0)
            {
                int c = 0;
                while(c < nums[i])
                {
                    ind++;
                    if(ind > nums.length - 1)
                        ind = 0;
                    c++;
                }
            }
            else if(nums[i] < 0)
            {
                int c = 0;
                while(c < Math.abs(nums[i]))
                {
                    ind--;
                    if(ind < 0)
                        ind = nums.length - 1;
                    c++;
                }
            }
            result[i] = nums[ind];
        }
        return result;
    }
}
*/
