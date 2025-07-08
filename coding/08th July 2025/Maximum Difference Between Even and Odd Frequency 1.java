//Maximum Difference Between Even and Odd Frequency 1
class Solution 
{
    public int maxDifference(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(char key : map.keySet())
        {
            int val = map.get(key);
            if(val % 2 != 0)
            {
                if(val > max)
                    max = val;
            }
            else if(val % 2 == 0)
            {
                if(val < min)
                    min = val;
            }
        }
        if(max == Integer.MIN_VALUE || min == Integer.MAX_VALUE)
            return -1;
        return max - min;
    }
}
