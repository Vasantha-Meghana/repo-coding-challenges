//Happy Number
class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n))
        {
            set.add(n);
            int res = 0;
            while(n > 0)
            {
                int r = n % 10;
                res += r * r;
                n = n / 10;
            }
            n = res;
            if(n == 1)
                return true;
        }
        return false;
    }
}
