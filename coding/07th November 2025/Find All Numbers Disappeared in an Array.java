//Find All Numbers Disappeared in an Array
/*
class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
            set.add(ele);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++)
        {
            if(!set.contains(i))
                result.add(i);
        }
        return result;
    }
}
*/
class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        boolean isAvail[] = new boolean[nums.length];
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
            isAvail[nums[i] - 1] = true; 
        for(int i = 0; i < isAvail.length; i++)
        {
            if(!isAvail[i])
                res.add(i + 1);       
        }
        return res;
    }
}
