//Valid Anagram
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            elsea
                map.put(ch, 1);
        }
        for(char ch : t.toCharArray())
        {
            if(!map.containsKey(ch) || map.get(ch) <= 0)
                return false;
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
}
