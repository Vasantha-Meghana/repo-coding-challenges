//Majority Element 2
class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int k : map.keySet())
        {
            if(map.get(k) > nums.length / 3)
                ans.add(k);
        }
        return ans;
    }
}
