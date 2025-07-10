//Minimum Index of a Valid Split
class Solution 
{
    public int minimumIndex(List<Integer> nums) 
    {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int dom = 0, count = 0;
        for(int ele : nums)
        {
            if(map1.containsKey(ele))
                map1.put(ele, map1.get(ele) + 1);
            else
                map1.put(ele, 1);
        }
        for(int i = 0; i < nums.size(); i++)
        {
            int ele = nums.get(i);
            map1.put(ele, map1.get(ele) - 1);
            if(map2.containsKey(ele))
                map2.put(ele, map2.get(ele) + 1);
            else
                map2.put(ele, 1);
            if(map1.get(ele) * 2 > nums.size() - i - 1 && map2.get(ele) * 2 > i + 1)
                return i;
        }
        return -1;
    }
}
