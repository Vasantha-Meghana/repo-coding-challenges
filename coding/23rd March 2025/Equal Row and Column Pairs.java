//Equal Row and Column Pairs
class Solution 
{
    public int equalPairs(int[][] grid) 
    {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < grid.length; i++)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0; j < grid.length; j++)
                arr.add(grid[i][j]);
            if(map.containsKey(arr))
                map.put(arr, map.get(arr) + 1);
            else
                map.put(arr, 1);
        }
        for(int i = 0; i < grid.length; i++)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0; j < grid.length; j++)
                arr.add(grid[j][i]);
            if(map.containsKey(arr))
                res += map.get(arr);
        }
        return res;
    }
}
