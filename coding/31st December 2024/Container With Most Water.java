//Container With Most Water
class Solution 
{
    public int maxArea(int[] height) 
    {
        int i = 0, j = height.length - 1;
        int area = 0;
        while(i < j)
        {
            int w = Math.abs(i - j);
            int h = height[i];
            if(height[j] < height[i])
                h = height[j];
            int currArea = w * h;
            if(area < currArea)
                area = currArea;
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}
