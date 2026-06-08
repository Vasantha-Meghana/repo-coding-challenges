//Partition Array According to Given Pivot
class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int[] res = new int[nums.length];
        int l = 0, e = 0, g = 0;
        for(int ele : nums)
        {
            if(ele < pivot)
                l++;
            else if(ele == pivot)
                e++;
            else
                g++;
        }
        int i = 0, j = nums.length - g, k = nums.length - g - e;
        for(int ele : nums)
        {
            if(ele < pivot)
            {
                res[i] = ele;
                i++;
            }
            else if(ele > pivot)
            {
                res[j] = ele;
                j++;
            }
            else if(ele == pivot)
            {
                res[k] = ele;
                k++;
            }
        }
        return res;
    }
}
