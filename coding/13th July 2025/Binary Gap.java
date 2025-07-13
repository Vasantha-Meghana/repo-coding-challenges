//Binary Gap
class Solution 
{
    public int binaryGap(int n) 
    {
        int max = 0;
        while(n > 0)
        {
            int r = n % 2;
            n = n / 2;
            if(r == 1)
            {
                int size = 1;
                while(n > 0 && n % 2 == 0)
                {
                    n = n / 2;
                    size++;
                }
                if(n > 0 && n % 2 == 1)
                    if(size > max)
                        max = size;
            }
        }
        return max;
    }
}
