//Find the Difference
class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        for(char ch : t.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) - 1);
            else
                map.put(ch, 1);
        }
        for(char c : map.keySet())
        {
            if(map.get(c) == 1 || map.get(c) < 0)
                return c;
        }
        char c = 0;
        return c;
    }
}
