//Minimum Number of Steps to make Two Strings Anagram
class Solution 
{
    public int minSteps(String s, String t) 
    {
        int[] count = new int[26];
        for (char c : s.toCharArray()) 
            count[c - 'a']++;
        for (char c : t.toCharArray()) 
            count[c - 'a']--;

        int result = 0;
        for (int val : count) 
        {
            if (val > 0) 
                result += val;
        }
        return result;
        /*
        HashMap<Character, Integer> map = new HashMap<>();
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
        }
        int result = 0;
        for(char key : map.keySet())
        {
            if(map.get(key) > 0)
            {
                result += map.get(key);
            }
        }
        return result;
        */
    }
}
