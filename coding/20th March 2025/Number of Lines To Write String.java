//Number of Lines To Write String
class Solution 
{
    public int[] numberOfLines(int[] widths, String s) 
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int ind = 0;
        for(char ch = 'a'; ch <= 'z'; ch++, ind++)
            map.put(ch, widths[ind]);
        int w = 0, c = 1;
        for(char ch : s.toCharArray())
        {
            w = w + map.get(ch);
            if(w > 100)
            {
                w = map.get(ch);
                c++;
            }
        }
        int[] res = new int[2];
        res[0] = c;
        res[1] = w;
        return res;
    }
}
