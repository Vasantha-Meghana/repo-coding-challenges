//Height Checker
class Solution 
{
    public int heightChecker(int[] heights) 
    {
        int[] original = new int[heights.length];
        for(int i = 0; i < heights.length; i++)
            original[i] = heights[i];
        Arrays.sort(heights);
        int res = 0;
        for(int i = 0; i < heights.length; i++)
            if(original[i] != heights[i])
                res++;
        return res;
    }
}
