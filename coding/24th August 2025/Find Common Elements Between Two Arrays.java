//Find Common Elements Between Two Arrays
class Solution 
{
    public int[] findIntersectionValues(int[] nums1, int[] nums2) 
    {
        int count1 = 0, count2 = 0;
        int[] result = new int[2];
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele : nums1)
            set1.add(ele);
        for(int ele : nums2)
            set2.add(ele);
        for(int ele : nums1)
            if(set2.contains(ele))
                count1++;
        for(int ele : nums2)
            if(set1.contains(ele))
                count2++;
        result[0] = count1;
        result[1] = count2;
        return result;
    }
}
