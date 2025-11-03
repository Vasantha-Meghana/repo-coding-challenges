//Minimum Time to Make Rope Colorful
class Solution 
{
    public int minCost(String colors, int[] neededTime) 
    {
        int result = 0, prev = neededTime[0];
        for(int i = 1; i < colors.length(); i++)
        {
            if(colors.charAt(i) == colors.charAt(i - 1))
            {
                result += Math.min(prev, neededTime[i]);
                prev = Math.max(prev, neededTime[i]);
            }
            else
                prev = neededTime[i];
        }
        return result;
    }
}
