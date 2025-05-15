//Find Missing and Repeated Values
class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] res = new int[2];
        int sum = 0, n = grid.length;
        for(int i = 1; i <= (n * n); i++)
            sum += i;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(set.contains(grid[i][j]))
                    res[0] = grid[i][j];
                else
                {
                    set.add(grid[i][j]);
                    sum -= grid[i][j];
                }
            }
        }
        res[1] = sum;
        return res;
    }
}
