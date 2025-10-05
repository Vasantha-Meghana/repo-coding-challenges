//Difference Between Ones and Zeros in Row and Column
class Solution 
{
    public int[][] onesMinusZeros(int[][] grid) 
    {
        int m = grid.length, n = grid[0].length;
        int[][] result = new int[m][n];
        int[] or = new int[m];
        int[] zr = new int[m];
        int[] oc = new int[n];
        int[] zc = new int[n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == 0)
                {
                    zr[i] = zr[i] + 1;
                    zc[j] = zc[j] + 1;
                }
                else if(grid[i][j] == 1)
                {
                    or[i] = or[i] + 1;
                    oc[j] = oc[j] + 1;
                }
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                result[i][j] = or[i] + oc[j] - zr[i] - zc[j];
            }
        }
        return result;
    }
}
