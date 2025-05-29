//Top K Frequent Elements
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++)
        {
            int k1 = nums[0], max = Integer.MIN_VALUE;
            for(int key : map.keySet())
            {
                if(map.get(key) > max)
                {
                    max = map.get(key);
                    k1 = key;
                }
            }
            ans[i] = k1;
            map.remove(k1);
        }
        return ans;
    }
}
