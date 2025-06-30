//Longest Harmonious Subsequence
class Solution 
{
    public int findLHS(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(Math.abs(nums[i] - nums[i + 1]) == 1)
            {
                if(map.get(nums[i]) + map.get(nums[i + 1]) > max)
                    max = map.get(nums[i]) + map.get(nums[i + 1]);
            }
        }
        return max;
    }
}
