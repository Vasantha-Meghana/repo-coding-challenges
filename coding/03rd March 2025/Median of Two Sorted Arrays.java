//Median of Two Sorted Arrays
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0;
        int i1 = 0, i2 = 0;
        while(i1 < nums1.length && i2 < nums2.length)
        {
            if(nums1[i1] < nums2[i2])
            {
                arr[i] = nums1[i1];
                i1++;
            }
            else
            {
                arr[i] = nums2[i2];
                i2++;
            }
            i++;
        }
        while(i1 <nums1.length)
        {
            arr[i] = nums1[i1];
            i1++;
            i++;
        }
        while(i2 <nums2.length)
        {
            arr[i] = nums2[i2];
            i2++;
            i++;
        }
        int n = arr.length;
        if(n % 2 != 0)
            return (double)arr[n / 2];
        return (double)(arr[n / 2] + arr[(n / 2) - 1]) / 2;
    }
}
