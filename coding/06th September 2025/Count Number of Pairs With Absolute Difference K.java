//Count Number of Pairs With Absolute Difference K
class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int ele : nums)
        {
            if(map.containsKey(ele + k))
                result += map.get(ele + k);
        }
        return result;
        /*
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(Math.abs(nums[i] - nums[j]) == k) {
                    result++;
                }
            }
        }
        return result;
        */
    }
}
