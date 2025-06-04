//Defuse the Bomb
class Solution 
{
    public int[] decrypt(int[] code, int k) 
    {
        int n = code.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            if(k > 0)
            {
                for(int j = 1; j <= k; j++)
                    sum += code[(i + j) % n];
            }
            else if(k < 0)
            {
                for(int j = i - 1; j > i - 1 + k; j--)
                    sum += code[((j % n) + n) % n];
            }
            res[i] = sum;
        }
        return res;
    }
}
