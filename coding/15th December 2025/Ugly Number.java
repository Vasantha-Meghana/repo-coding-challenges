//Ugly Number
class Solution 
{
    public boolean isUgly(int n) 
    {
        if (n <= 0) 
            return false;
        int[] arr = {2, 3, 5};
        for (int i : arr) 
        {
            while (n % i == 0)
                n = n / i;
        } 
        return n == 1;
    }
}
