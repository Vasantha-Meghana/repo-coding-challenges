//Add to Array-Form of Integer
class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = num.length - 1; i >= 0; i--)
        {
            int s = num[i] + k;
            int r = s % 10;
            res.addFirst(r);
            k = s / 10;
        }
        while(k > 0)
        {
            res.addFirst(k % 10);
            k = k / 10;
        }
        return res;
    }
}
