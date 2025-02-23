//Two Sum
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        for(int i = 0; i < nums.length; i++)
        {
            int new_target = target - nums[i];
            if(map.containsKey(new_target) && i != map.get(new_target))
            {
                res[0] = i;
                res[1] = map.get(new_target);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
