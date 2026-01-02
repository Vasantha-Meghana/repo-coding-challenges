//N-Repeated Element in Size 2N Array
/*
class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
            {
                map.put(ele, map.get(ele) + 1);
                if(map.get(ele) == nums.length / 2)
                    return ele;
            }
            else
                map.put(ele, 1);
        }
        return 0;
    }
}
*/
class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
        Arrays.sort(nums);
        int c = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] == nums[i])
            {
                c++;
                if(c + 1 == nums.length / 2)
                    return nums[i];
            }
            else
                c = 0;
        }
        return 0;
    }
}
