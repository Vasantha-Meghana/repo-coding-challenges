//Convert an Array Into a 2D Array With Conditions
class Solution 
{
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        ArrayList<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet())
        {
            if(map.get(key) > max)
                max = map.get(key);
        }
        for(int i = max; i > 0; i--)
        {
            ArrayList<Integer> arr  = new ArrayList<>();
            for(int key : map.keySet())
            {
                if(map.get(key) == i)
                {
                    arr.add(key);
                    map.put(key, map.get(key) - 1);
                }
            }
            result.add(arr);
        }
        return result;
    }
}
