class Solution 
{
    public int minSubarray(int[] nums, int p) 
    {
        long total = 0;
        for(int ele : nums)
            total += ele;
        int rem = (int) (total % p);
        if(rem == 0)   
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        long prefixsum = 0;
        int minLength = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            prefixsum += nums[i];
            int curr = (int) (prefixsum % p);
            int target = (curr - rem + p) % p;
            if(map.containsKey(target))
                minLength = Math.min(minLength, i - map.get(target));
            map.put(curr, i);
        }
        if(minLength == nums.length)
            return -1;
        return minLength;
    }
}
