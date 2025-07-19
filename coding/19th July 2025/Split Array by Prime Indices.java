//Split Array by Prime Indices
class Solution 
{
    public long splitArray(int[] nums) 
    {
        long total = 0, sumB = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (!isPrime(i)) {
                sumB += nums[i];
            }
        }
        long sumA = total - sumB;
        return Math.abs(sumA - sumB);
    }

    private boolean isPrime(int n) 
    {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) 
            if (n % i == 0) return false;
        
        return true;
    }
}
