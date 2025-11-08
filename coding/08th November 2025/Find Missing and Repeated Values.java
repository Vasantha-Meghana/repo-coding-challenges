//Find Missing and Repeated Values
class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(set.contains(grid[i][j]))
                    result[0] = grid[i][j];
                set.add(grid[i][j]);
            }
        }
        for(int i = 1; i <= (grid.length * grid[0].length); i++)
        {
            if(!set.contains(i))
                result[1] = i;
        }
        return result;
    }
}
/*
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
*/
