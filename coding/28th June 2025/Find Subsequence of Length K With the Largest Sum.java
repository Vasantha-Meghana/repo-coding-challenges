//Find Subsequence of Length K With the Largest Sum
class Solution 
{
    public int[] maxSubsequence(int[] nums, int k) 
    {
        int[][] arr = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++)
        {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(arr[i][0] < arr[j][0])
                {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int[][] topk = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            topk[i][0] = arr[i][0];
            topk[i][1] = arr[i][1];
        }
        for(int i = 0; i < k - 1; i++)
        {
            for(int j = i + 1; j < k; j++)
            {
                if(topk[i][1] > topk[j][1])
                {
                    int[] temp = topk[i];
                    topk[i] = topk[j];
                    topk[j] = temp;
                }
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++)
            result[i] = topk[i][0];
        return result;
    }
}
