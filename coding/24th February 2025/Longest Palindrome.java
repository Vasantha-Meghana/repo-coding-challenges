//Longest Palindrome
class Solution 
{
    public int longestPalindrome(String s) 
    {
        if(s.length() == 1)   return 1;
        int odd = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
            if(map.get(ch) % 2 != 0)
                odd++;
            else
                odd--;
        }
        if(odd > 1)   return s.length() - odd + 1;
        return s.length();
    }
}
