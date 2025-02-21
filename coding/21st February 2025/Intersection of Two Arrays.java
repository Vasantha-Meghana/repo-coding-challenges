//Intersection of Two Arrays
class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int ele1 : nums1)
            set1.add(ele1);
        for(int ele2 : nums2)
            set2.add(ele2);
        for(int ele1 : set1)
        {
            if(set2.contains(ele1))
                res.add(ele1);
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
}
