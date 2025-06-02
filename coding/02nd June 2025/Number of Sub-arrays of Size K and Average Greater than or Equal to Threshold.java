//Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
class Solution 
{
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int ans = 0, sum = 0;
        int l = 0, r = 0;
        while(r < arr.length)
        {
            sum += arr[r];
            if(r - l + 1 == k)
            {
                if(sum / k >= threshold)
                    ans++;
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return ans;
        /*
        int ans = 0;
        for(int i = 0; i <= arr.length - k; i++)
        {
            int sum = 0;
            for(int j = i; j < i + k; j++)
                sum += arr[j];
            if(sum / k >= threshold)
                ans++;
        }
        return ans;
        */
    }
}
