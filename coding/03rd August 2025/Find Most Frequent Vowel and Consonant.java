// Find Most Frequent Vowel and Consonant
class Solution 
{
    public int maxFreqSum(String s) 
    {
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        int vowel = 0, consonent = 0;
        for(char key : map.keySet())
        {
            if(set.contains(key))
            {
                if(vowel < map.get(key))
                    vowel = map.get(key);
            }
            else
            {
                if(consonent < map.get(key))
                    consonent = map.get(key);
            }
        }
        return vowel + consonent;
    }
}
