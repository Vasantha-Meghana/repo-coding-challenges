//Maximize Happiness of Selected Children
class Solution 
{
    public long maximumHappinessSum(int[] happiness, int k) 
    {
        Arrays.sort(happiness);
        int i = happiness.length - 1;
        long result = 0; 
        int c = 0;
        while(i >= 0 && c < k)
        {
            int val = (happiness[i] - c);
            if(val <= 0)
                break;
            result += val;
            c++;
            i--;
        }
        return result;
    }
}
