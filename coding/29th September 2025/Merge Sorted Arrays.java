//Merge Sorted Arrays
/*
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        for(int i = 0, j = m; i < n; i++, j++)
            nums1[j] = nums2[i];
        Arrays.sort(nums1);
    }
}
*/
class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = m - 1, j = n - 1, ind = m + n - 1;
        while(j >= 0)
        {
            if( i >= 0 && nums1[i] > nums2[j])
            {
                nums1[ind] = nums1[i];
                ind--;
                i--;
            }
            else
            {
                nums1[ind] = nums2[j];
                j--;
                ind--;
            }
        }
    }
}
