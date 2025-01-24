//Summary Ranges
class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> res = new ArrayList<String>();
        int i = 0, j = 0;
        while(j < nums.length)
        {
            i = j;
            while(j < nums.length - 1 && nums[j + 1] == nums[j] + 1)
                j++;
            if(i != j)
                res.add(String.valueOf(nums[i]) + "->" + String.valueOf(nums[j]));
            else
                res.add(String.valueOf(nums[i]));
            j++;
        }
        return res;
    }
}
