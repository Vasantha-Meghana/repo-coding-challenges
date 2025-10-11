//Earliest Time to Finish One Task
class Solution 
{
    public int earliestTime(int[][] tasks) 
    {
        int min = Integer.MAX_VALUE;
        for(int[] arr : tasks)
        {
            if(arr[0] + arr[1] < min)
                min = arr[0] + arr[1];
        }
        return min;
    }
}
