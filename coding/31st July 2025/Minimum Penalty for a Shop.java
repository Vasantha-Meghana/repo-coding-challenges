//Minimum Penalty for a Shop
class Solution 
{
    public int bestClosingTime(String customers) 
    {
        int j = -1, score = 0, max = 0;
        char[] array = customers.toCharArray();
        for(int i = 0; i < array.length; i++)
        {
            int v = -1;
            if(array[i] == 'Y')
                v = 1;
            score += v;
            if(score > max)
            {
                j = i;
                max = score;
            }
        }
        return j + 1;
    }
}
