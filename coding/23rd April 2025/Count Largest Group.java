//Count Largest Group
class Solution 
{
    public int sumd(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) 
    {
        int[] sums = new int[37];
        for(int i = 1; i <= n; i++)
            sums[sumd(i)]++;
        int max = 0, c = 0;
        for(int i : sums)
        {
            if(i > max)
            {
                max = i;
                c = 1;
            }
            else if(i == max)
                c++;
        }    
        return c;
    }
}
