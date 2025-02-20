//Hamming Distance
class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int c = 0;
        while(x > 0 || y > 0)
        {
            int r1 = x % 2;
            int r2 = y % 2;
            if(r1 != r2)
                c++;
            x = x / 2;
            y = y / 2;
        }
        return c;
    }
}
