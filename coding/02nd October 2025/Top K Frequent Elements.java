//Top K Frequent Elements
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int i = 0; i < k; i++)
        {
            int max = Integer.MIN_VALUE, key2 = 0;
            for(int key : map.keySet())
            {
                if(map.get(key) > max)
                {
                    key2 = key;
                    max = map.get(key);
                }
            }
            result[i] = key2;
            map.remove(key2);
        }
        return result;
    }
}
