//Sum of Values at Indices With K Set Bits
class Solution 
{
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) 
    {
        int result = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            int c = 0, t = i;
            while(t > 0)
            {
                int r = t % 2;
                t = t / 2;
                if(r == 1)
                    c++;
            }
            if(c == k)
                result += nums.get(i);
        }
        return result;
    }
}
