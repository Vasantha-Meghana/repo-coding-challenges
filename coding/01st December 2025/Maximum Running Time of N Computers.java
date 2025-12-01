//Maximum Running Time of N Computers
class Solution 
{
    public long maxRunTime(int n, int[] batteries) 
    {
        long total = 0;
        for (int b : batteries) 
        {
            total += b;
        }
        Arrays.sort(batteries);
        for (int i = batteries.length - 1; i >= 0; i--) 
        {
            if (batteries[i] > total / n) 
            {
                total -= batteries[i];
                n--;
            } 
            else
                break;
        }
        return total / n;
    }
}
