//Two Sum
class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
/*
class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
            {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
*/
