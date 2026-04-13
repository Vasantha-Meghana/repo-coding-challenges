//Minimum Distance to the Terget Element
class Solution 
{
    public int getMinDistance(int[] nums, int target, int start) 
    {
        /*
        int i = 0, j = nums.length - 1, min = Integer.MAX_VALUE;
        while(i <= j)
        {
            if(nums[i] == target)
                if(Math.abs(i - start) < min)
                    min = Math.abs(i - start);
            if(nums[j] == target)
                if(Math.abs(j - start) < min)
                    min = Math.abs(j - start);
            i++;
            j--;
        }
        return min;
        */
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                min = Math.min(min, Math.abs(i - start));
        }
        return min;
    }
}
