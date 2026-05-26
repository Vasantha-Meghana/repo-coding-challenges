//Count the Number of Special Characters 1
class Solution 
{
    public int numberOfSpecialChars(String word) 
    {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        for(char ch : word.toCharArray())
        {
            if(Character.isLowerCase(ch))
                lower.add(ch);
            else
                upper.add(Character.toLowerCase(ch));
        }
        int res = 0;
        for(char ch : lower)
            if(upper.contains(ch))
                res++;
        return res;
    }
}
