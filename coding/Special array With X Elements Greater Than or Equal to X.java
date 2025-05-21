//Special array With X Elements Greater Than or Equal to X
class Solution 
{
    public int count(int[] nums, int n, int x)
    {
        int l = 0, r = n - 1;
        int f = n;
        while(l <= r)
        {
            int mid = (l + r) / 2;
            if(nums[mid] >= x)
            {
                f = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }
        return n - f;
    }
    public int specialArray(int[] nums) 
    {
        Arrays.sort(nums);
        for(int x = 1; x <= nums.length; x++)
        {
            if(x == count(nums, nums.length, x))
                return x;
        }
        return -1;
    }
}
