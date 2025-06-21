//Excel Sheet Column Number
class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 1;
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            map.put(ch, i);
            i++;
        }
        if(columnTitle.length() == 1)
            return map.get(columnTitle.charAt(0));
        int res = 0, p = 0;
        for(int j = columnTitle.length() - 1; j >= 0; j--)
        {
            res += Math.pow(26, p) * map.get(columnTitle.charAt(j));
            p++;
        }
        return res;
    }
}
