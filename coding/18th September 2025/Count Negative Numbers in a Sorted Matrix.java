//Count Negative Numbers in a Sorted Matrix
class Solution 
{
    public int countNegatives(int[][] grid) 
    {
        int result = 0;
        for(int i = 0; i < grid.length; i++)
        {
            int j = grid[0].length - 1;
            if(grid[i][j] < 0)
            {
                while(j >= 0 && grid[i][j] < 0)
                {
                    j--;
                    result++;
                }
            }
            else
                continue;
        }
        return result;
    }
}
