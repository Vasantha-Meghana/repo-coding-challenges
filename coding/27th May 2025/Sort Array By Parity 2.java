//Sort Array By Parity
class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int i = 0, j = nums.length - 1;
        while(i < j)
        {
            if(nums[i] % 2 != 0 && nums[j] % 2 == 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            if(nums[i] % 2 == 0)
                i++;
            if(nums[j] % 2 != 0)
                j--;
        }
        return nums;
        /*
        int res[] = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for(int ind = 0; ind < nums.length; ind++)
        {
            if(nums[ind] % 2 == 0)
            {
                res[i] = nums[ind];
                i++;
            }
            else
            {
                res[j] = nums[ind];
                j--;
            }
        }
        return res;*/
    }
}
