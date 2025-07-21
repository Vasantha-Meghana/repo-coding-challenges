//Last Visited Integers
class Solution 
{
    public List<Integer> lastVisitedIntegers(int[] nums) 
    {
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == -1)
            {
                k++;
                if(k <= seen.size())
                    ans.add(seen.get(seen.size() - k));
                else
                    ans.add(-1);
            }
            else
            {
                k = 0;
                seen.add(nums[i]);
            }
        }
        return ans;
    }
}
