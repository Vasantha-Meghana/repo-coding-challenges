//Shortest Completing Word
class Solution 
{
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : licensePlate.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                ch = Character.toLowerCase(ch);
                if(map.containsKey(ch))
                    map.put(ch, map.get(ch) + 1);
                else
                    map.put(ch, 1);
            }
        }
        for(String str : words)
        {
            if(completes(map, str))
                return str;
        }
        return "";
    }
    boolean completes(HashMap<Character, Integer> map, String str)
    {
        HashMap<Character, Integer> temp = new HashMap<>(map);
        for(char ch : str.toCharArray())
        {
            ch = Character.toLowerCase(ch);
            if(temp.containsKey(ch))
                temp.put(ch, temp.get(ch) - 1);
        }
        for(char key : temp.keySet())
        {
            if(temp.get(key) > 0)
                return false;
        }
        return true;
    }
}
