// Largest Local Values in a Matrix
class Solution 
{
    public int[][] largestLocal(int[][] grid) 
    {
        int[][] result = new int[grid.length - 2][grid[0].length - 2];
        for(int i = 0; i < grid.length - 2; i++)
        {
            for(int j = 0; j < grid[i].length - 2; j++)
            {
                int max = Integer.MIN_VALUE;
                for(int i1 = i; i1 <= i + 2; i1++)
                {
                    for(int j1 = j; j1 <= j + 2; j1++)
                    {
                        max = Math.max(max, grid[i1][j1]);
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}
