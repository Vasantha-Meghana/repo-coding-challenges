//Replace Element with Greatest Element on Right side
class Solution 
{
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 0; i < n - 1; i++)
        {
            int max = arr[i + 1];
            for(int j = i + 1; j < n; j++)
                if(arr[j] > max)
                    max = arr[j];
            res[i] = max;
        }
        res[n - 1] =- 1;
        return res;
    }
}
