//Longest Repeating Character Replacement
class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int j = 0, maxF = 0, res = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxF = Math.max(maxF, map.get(ch));
            int len = i - j + 1;
            if(len - maxF > k)
            {
                char ch2 = s.charAt(j);
                map.put(ch2, map.get(ch2) - 1);
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
