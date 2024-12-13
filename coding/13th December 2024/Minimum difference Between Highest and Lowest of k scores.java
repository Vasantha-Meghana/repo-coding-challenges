//Minimum difference Between Highest and Lowest of k scores
class Solution 
{
    public int minimumDifference(int[] nums, int k) 
    {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - k + 1; i++)
        {
            int j = i + k - 1;
            System.out.println(nums[i] + ' ' + nums[j]);
            int temp = nums[j] - nums[i];
            if(temp < min)
                min = temp;
        }
        return min;
    }
}