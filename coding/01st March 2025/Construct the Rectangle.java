//Construct the Rectangle
class Solution 
{
    public int[] constructRectangle(int area) 
    {
        int[] res = new int[2];
        for(int i = (int)Math.sqrt(area); i >= 1; i--)
        {
            if(area % i == 0)
            {
                res[0] = area / i;
                res[1] = i;
                return res;
            }
        }
        res[0] = area;
        res[1] = 1;
        return res;

    }
}
