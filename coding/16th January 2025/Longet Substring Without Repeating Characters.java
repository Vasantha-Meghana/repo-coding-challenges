//Longet Substring Without Repeating Characters
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxlength = 0, left = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left)
                left = map.get(ch) + 1;
            maxlength = Math.max(maxlength, right - left +1);
            map.put(ch, right);
        }
        return maxlength;
    }
}
