// Range Addition 2
class Solution 
{
    public int maxCount(int m, int n, int[][] ops) 
    {
        int minRow = m, minCol = n;
        for(int[] ele : ops)
        {
            minRow = Math.min(minRow, ele[0]);
            minCol = Math.min(minCol, ele[1]);
        }
        return minRow * minCol;
    }
}
