//Rearrange Array Elements by Sign
class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int[] result = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                result[j] = nums[i];
                j += 2;
            }
            else if(nums[i] < 0)
            {
                result[k] = nums[i];
                k += 2;
            }
        }
        return result;


        /* int[] parr = new int[nums.length / 2];
        int[] narr = new int[nums.length / 2];
        int i = 0, j = 0;
        for(int ele : nums)
        {
            if(ele < 0)
            {
                narr[i] = ele;
                i++;
            }
            else if(ele > 0)
            {
                parr[j] = ele;
                j++;
            }
        }
        int a = 0, b = 0;
        for(int i1 = 0; i1 < nums.length; i1++)
        {
            if(i1 % 2 == 0)
            {
                nums[i1] = parr[a];
                a++;
            }
            else
            {
                nums[i1] = narr[b];
                b++;
            }
        }
        return nums; */
    }
}
