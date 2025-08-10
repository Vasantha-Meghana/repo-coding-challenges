//Flip Square Submatrix Vertically
class Solution 
{
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) 
    {
        for (int i = 0; i < k / 2; i++) 
        {
            for (int j = 0; j < k; j++) 
            {
                int r1 = x + i, c1 = y + j;
                int r2 = x + (k - 1 - i), c2 = y + j;
                int temp = grid[r1][c1];
                grid[r1][c1] = grid[r2][c2];
                grid[r2][c2] = temp;
            }
        }
        return grid;
    }
}
