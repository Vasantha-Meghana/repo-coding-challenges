// Count Number of Maximum Bitwise-OR Subsets
class Solution {
    int max, count;
    public int countMaxOrSubsets(int[] nums) {
        dfs(nums, 0, 0);
        return count;
    }
    void dfs(int[] nums, int index, int curr)
    {
        if(index == nums.length)
        {
            if(curr > max)
            {
                max = curr;
                count = 1;
            }
            else if(curr == max)
                count++;
            return;
        }
        dfs(nums, index + 1, curr | nums[index]);
        dfs(nums, index + 1, curr);
    }
}
