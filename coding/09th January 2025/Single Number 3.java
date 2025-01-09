//Single Number 3
class Solution 
{
    public int[] singleNumber(int[] nums) 
    {
        if (nums.length == 2)  return nums;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        } 
        int i = 0;
        for(int ele : nums)
        {
            if(map.get(ele) == 1)
            {
                res[i] = ele;
                i++;
            }
        }
        return res;
    }
}
