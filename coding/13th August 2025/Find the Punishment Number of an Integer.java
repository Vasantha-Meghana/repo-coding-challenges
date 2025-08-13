//Find the Punishment Number of an Integer
class Solution 
{
    public boolean canPartition(int num, int t)
    {
        if(num < t || t < 0)
            return false;
        if(num == t)
            return true;
        return (canPartition(num/10,t-(num%10)) || canPartition(num/100,t-(num%100)) || canPartition(num/1000,t-(num%1000)));
    }
    public int punishmentNumber(int n) 
    {
        int result = 0;
        for(int num = 1; num <= n; num++)
        {
            int s = num * num;
            if(canPartition(s, num))
                result += s;
        }
        return result;
    }
}
