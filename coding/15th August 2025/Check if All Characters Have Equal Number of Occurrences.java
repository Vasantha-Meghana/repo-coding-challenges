//Check if All Characters Have Equal Number of Occurrences
class Solution 
{
    public boolean areOccurrencesEqual(String s) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        int val = map.get(s.charAt(0));
        for(int value : map.values())
        {
            if(value != val)
                return false;
        }
        return true;
    }
}
