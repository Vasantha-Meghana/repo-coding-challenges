//Count Hills and Valleys in an Array
class Solution 
{
    public int countHillValley(int[] nums) 
    {
        int count = 0;
        for(int i = 1; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i - 1])   continue;
            int i1 = i - 1, j1 = i + 1;
            while(i1 >= 0 && nums[i1] == nums[i])
                i1--;
            while(j1 < nums.length && nums[j1] == nums[i])
                j1++;
            if (i1 >= 0 && j1 < nums.length)
            {
                if((nums[i1] > nums[i] && nums[j1] > nums[i]) || (nums[i1] < nums[i] && nums[j1] < nums[i]))
                    count++;
            }
        }
        return count;
    }
}
