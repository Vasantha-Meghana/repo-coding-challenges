//Number of Subsequences That Satisfy the Given Sum Condition
class Solution 
{
    public int numSubseq(int[] nums, int target) 
    {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        long count = 0;
        int mod = 1000000007;
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i = 1; i < nums.length; i++)
            arr[i] = (arr[i - 1] * 2) % mod;
        while(start <= end)
        {
            if(nums[start] + nums[end] > target)
                end--;
            else
            {
                count = (count + arr[end - start]) % mod;
                start++;
            }
        }
        return (int)count;
    }
}
