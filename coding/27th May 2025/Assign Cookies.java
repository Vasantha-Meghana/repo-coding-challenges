//Assign Cookies
class Solution
{
    public int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(s);
        Arrays.sort(g);
        int res = 0;
        int i = s.length - 1, j = g.length - 1;
        while(i >= 0 && j >= 0)
        {
            if(s[i] >= g[j])
            {
                res++;
                i--;
                j--;
            }
            else
                j--;
        }
        return res;
    }
}
