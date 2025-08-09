//Decode the Message
class Solution 
{
    public String decodeMessage(String key, String message) 
    {
        HashMap<Character, Character> map = new HashMap<>();
        char ch = 'a';
        for(char c : key.toCharArray())
        {
            if(map.containsKey(c) || c == ' ')
                continue;
            else
            {
                map.put(c, ch);
                ch++;
            }
        }
        String result = "";
        for(char c : message.toCharArray())
        {
            if(c == ' ')
                result += ' ';
            else
                result += map.get(c);
        }
        return result;
    }
}
