//Teemo Attacking
class Solution 
{
    public int findPoisonedDuration(int[] timeSeries, int duration) 
    {
        if (timeSeries.length == 0) return 0;
        int tot = 0;
        for (int i = 1; i < timeSeries.length; i++)
        {
            int min =  Math.min(timeSeries[i] - timeSeries[i - 1], duration);
            tot += min;
        }
        return tot + duration;
    }
}
