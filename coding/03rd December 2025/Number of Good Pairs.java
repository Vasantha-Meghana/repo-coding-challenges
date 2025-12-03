//Number of Good Pairs
class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        int res = 0;
        for(int key : map.keySet())
        {
            int n = map.get(key);
            res += (n * (n - 1)) / 2;
        }
        return res;
    }
}
/*
class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
*/
