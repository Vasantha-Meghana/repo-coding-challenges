//Third Maximum Number
class Solution 
{
    public int thirdMax(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int ele : nums)
            set.add(ele);
        if(set.size() < 3)   return Collections.max(set);
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));
        return Collections.max(set);
    }
}
