class Solution 
{
    public int numberOfSpecialChars(String word) 
    {
        HashMap<Character, Integer> lowerLast = new HashMap<>();
        HashMap<Character, Integer> upperFirst = new HashMap<>();
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
                lowerLast.put(ch, i);
            else
            {
                char lower = Character.toLowerCase(ch);
                if(!upperFirst.containsKey(lower))
                    upperFirst.put(lower, i);
            }
        }
        int res = 0;
        for(char ch : lowerLast.keySet())
            if(upperFirst.containsKey(ch) && lowerLast.get(ch) < upperFirst.get(ch))
                res++;
        return res;
    }
}
