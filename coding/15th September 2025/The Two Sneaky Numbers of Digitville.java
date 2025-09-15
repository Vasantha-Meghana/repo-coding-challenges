//The Two Sneaky Numbers of Digitville
class Solution 
{
    public int[] getSneakyNumbers(int[] nums) 
    {
        Arrays.sort(nums);
        int[] result = new int[2];
        int i1 = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i - 1])
            {
                result[i1] = nums[i];
                i1++;
            }
        }
        return result;
    }
}
