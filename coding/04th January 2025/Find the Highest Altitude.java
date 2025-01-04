//Find the Highest Altitude
class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int sum = 0;
        int max = 0;
        for(int ele : gain)
        {
            sum = sum + ele;
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
