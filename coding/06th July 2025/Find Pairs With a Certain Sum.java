//Find Pairs With a Certain Sum
class FindSumPairs 
{
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) 
    {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int ele : nums2)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
    }
    
    public void add(int index, int val) 
    {
        int old = nums2[index];
        map.put(old, map.get(old) - 1);
        if(map.get(old) == 0)
            map.remove(old);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) 
    {
        int result = 0;
        for(int ele : nums1)
        {
            if(map.containsKey(tot - ele))
                result += map.get(tot - ele);
        }
        return result;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
