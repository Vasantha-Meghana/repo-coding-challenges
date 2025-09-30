//Valid Anagram
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())   return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
/*
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
*/
