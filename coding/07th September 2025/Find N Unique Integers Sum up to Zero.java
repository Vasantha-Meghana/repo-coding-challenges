//Find N Unique Integers Sum up to Zero
class Solution 
{
    public int[] sumZero(int n) 
    {
        int[] result = new int[n];
        int mid = n / 2, temp1 = mid, temp2 = mid;
        for(int i = 0; i < mid; i++)
        {
            result[i] = -temp1;
            temp1--;
        }
        for(int i = n - 1; i >= mid; i--)
        {
            result[i] = temp2;
            temp2--;
        }
        return result;
    }
}
