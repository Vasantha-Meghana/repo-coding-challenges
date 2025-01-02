//Max Consecutive Ones 3
class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int j = 0;
        int zeros = 0, cnt = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
                cnt++;
            else
                zeros++;
            while(j < nums.length && zeros > k)
            {
                if(nums[j] == 0)
                    zeros--;
                else
                    cnt--;
                j++;
            }
            if(ans < cnt + zeros)
                ans = cnt + zeros;
        }
        return ans;
    }
}
