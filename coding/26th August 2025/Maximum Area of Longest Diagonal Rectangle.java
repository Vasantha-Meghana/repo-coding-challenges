//Maximum Area of Longest Diagonal Rectangle
class Solution 
{
    public int areaOfMaxDiagonal(int[][] dimensions) 
    {
        int maxA = Integer.MIN_VALUE;
        double maxD = Double.MIN_VALUE;
        for(int[] d : dimensions)
        {
            double len = Math.sqrt((d[0] * d[0]) + (d[1] * d[1]));
            int area = d[0] * d[1];
            if(len > maxD)
            {
                maxD = len;
                maxA = area;
            }
            if(len == maxD)
            {
                if(area > maxA)
                    maxA = area;
            }
        }
        return maxA;
    }
}
