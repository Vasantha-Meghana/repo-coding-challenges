//Replace Element with Greatest Element on Right side
class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length;
        int[] res = new int[n];
        int max = arr[n - 1];
        for(int i = n - 2; i >= 0; i--)
        {
            res[i] = max;
            if(arr[i] > max)
                max = arr[i];
        }
        res[n - 1] = -1;
        return res;
    }
}
