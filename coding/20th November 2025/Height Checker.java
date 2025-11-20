//Height Checker
class Solution 
{
    public int heightChecker(int[] heights) 
    {
        Queue<Integer> queue = new PriorityQueue();
        for(int height : heights)
            queue.add(height);
        int res = 0;
        for(int i = 0; i < heights.length; i++)
        {
            int curr = queue.poll();
            if(curr != heights[i])
                res++;
        }
        return res;
    }
}
/*
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
*/
