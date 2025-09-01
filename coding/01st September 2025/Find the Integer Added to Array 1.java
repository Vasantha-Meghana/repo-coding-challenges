//Find the Integer Added to Array 1
class Solution 
{
    public int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int ele : arr)
            if(ele < min)
                min = ele;
        return min;
    }
    public int addedInteger(int[] nums1, int[] nums2) 
    {
        /*
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
        */
        return findMin(nums2) - findMin(nums1);
    }
}
