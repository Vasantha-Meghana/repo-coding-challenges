//Smallest Subarrays With Maximum Bitwise OR
class Solution 
{
    public int[] smallestSubarrays(int[] nums) 
    {
        int result[] = new int[nums.length];
        int[] latest = new int[32];
        for(int i = 0; i < 32; i++)
            latest[i] = -1;
        for(int i = nums.length - 1; i >= 0; i--)
        {
            int farthest = i;
            for(int b = 0; b < 32; b++)
            {
                if(((nums[i] >> b ) & 1) != 0)
                    latest[b] = i;
                if(latest[b] != -1)
                    farthest = Math.max(farthest, latest[b]);
            }
            result[i] = farthest - i + 1;
        }
        return result;
    }
}
