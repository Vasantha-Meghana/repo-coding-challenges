//Minimum Average of Smallest and Largest Elements
class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        int i = 0, j = nums.length - 1;
        Arrays.sort(nums);
        double res = Double.MAX_VALUE;
        for(int t = 0; t < nums.length / 2; t++)
        {
            double d = (nums[i] + nums[j]) / 2.0;
            if(d < res)
                res = d;
            i++;
            j--;
        }
        return res;
    }
}
