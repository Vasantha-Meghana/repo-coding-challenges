//DI String Match
class Solution 
{
    public int[] diStringMatch(String s) 
    {
        int i = 0, j = s.length(), n = s.length();
        int[] result = new int[n + 1];
        for(int ind = 0; ind < n; ind++)
        {
            if(s.charAt(ind) == 'I')
            {
                result[ind] = i;
                i++;
            }
            else
            {
                result[ind] = j;
                j--;
            }
        }
        result[n] = i;
        return result;
    }
}
