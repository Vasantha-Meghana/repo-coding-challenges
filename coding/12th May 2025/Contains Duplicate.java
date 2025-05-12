//Contains Duplicate
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
            if(map.get(ele) > 1)
                return true;
        }  
        return false;
    }
}
