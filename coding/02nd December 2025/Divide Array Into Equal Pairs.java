//Divide Array Into Equal Pairs
class Solution 
{
    public boolean divideArray(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int k : map.keySet())
            if(map.get(k) % 2 != 0)
                return false;
        return true;
    }
}
