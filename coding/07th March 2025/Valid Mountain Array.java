//Valid Mountain Array
class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        int i, j, n = arr.length;
        if(n < 3)   return false;
        for(i = 0; i < n - 1; i++)
            if(arr[i] >= arr[i + 1])
                break;
        for(j = n - 1; j > 0; j--)
            if(arr[j] >= arr[j - 1])
                break;
        return i == j && i != 0 && j != n - 1;
    }
}
