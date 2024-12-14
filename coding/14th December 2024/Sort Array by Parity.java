//Sort Array by Parity
class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] res = new int[nums.length];
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
        return res;
    }
}