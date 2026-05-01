class Solution 
{
    public int maxRotateFunction(int[] nums) 
    {
        int n = nums.length;
        long sum = 0, f = 0;
        for(int i = 0; i < n; i++)
        {
            sum += nums[i];
            f += (long)i * nums[i];
        }
        long max = f;
        for(int r = 1; r < n; r++)
        {
            f = f + sum - (long)n * nums[n - r];
            max = Math.max(max, f);
        }
        return (int)max;
    }
}
/*
class Solution 
{
    public int maxRotateFunction(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < nums.length; j++)
            {
                int index = (j + i) % nums.length;
                sum += (nums[index] * j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
*/
