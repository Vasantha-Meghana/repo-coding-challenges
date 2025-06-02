//Grumpy BookStore Owner
class Solution 
{
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        int sum = 0, max = 0;
        for(int i = 0; i < customers.length; i++)
        {
            if(grumpy[i] == 1)
                sum += customers[i];
            if(i >= minutes && grumpy[i - minutes] == 1)
                    sum -= customers[i - minutes];
            if(sum > max)
                max = sum;
        }
        int ans = 0;
        for(int i1 = 0; i1 < grumpy.length; i1++)
        {
            if(grumpy[i1] == 0)
                ans += customers[i1];
        }
        return ans + max;
    }
}
