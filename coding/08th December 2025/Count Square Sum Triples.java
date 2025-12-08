//Count Square Sum Triples
class Solution 
{
    public int countTriples(int n) 
    {
        int result = 0;
        for(int a = 1; a < n; a++)
        {
            for(int b = a + 1; b < n; b++)
            {
                int sum = (a * a) + (b * b);
                int c = (int)Math.sqrt(sum);
                if(c * c == sum && c <= n)
                    result++;
            }
        }
        return 2 * result;
    }
}
