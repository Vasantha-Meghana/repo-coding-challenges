//Check if Any Element Has Prime Frequency
class Solution 
{
    public boolean isPrime(int n)
    {
        if( n == 0 || n == 1)
            return false;
        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int k : map.keySet())
        {
            if(isPrime(map.get(k)))
                return true;
        }
        return false;
    }
}
