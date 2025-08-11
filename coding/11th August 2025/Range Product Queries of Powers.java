//Range Product Queries of Powers
class Solution 
{
    public int[] productQueries(int n, int[][] queries) 
    {
        int[] result = new int[queries.length];
        int ind = 0;
        int MOD = 1_000_000_007;
        ArrayList<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 31; i++)
            if (((n >> i) & 1) == 1)
                powers.add(1 << i);
        for(int[] ele : queries)
        {
            long temp = 1;
            for(int i = ele[0]; i <= ele[1]; i++)
                temp = (temp * powers.get(i)) % MOD;
            result[ind] = (int) temp;
            ind++;
        }
        return result;
    }
}
