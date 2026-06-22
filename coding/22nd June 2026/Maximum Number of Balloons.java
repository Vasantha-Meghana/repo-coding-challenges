//Maximum Number of Balloons
class Solution 
{
    int isValid(char ch)
    {
        if(ch == 'b' || ch == 'a' || ch == 'n')
            return 1;
        else if(ch == 'l' || ch == 'o')
            return 2;
        return 0;
    }
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : text.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        char[] arr = new char[]{'b', 'a', 'l', 'o', 'n'};
        int result = Integer.MAX_VALUE;
        for(char ch : arr)
        {
            if(!map.containsKey(ch))
                return 0;
            if(isValid(ch) == 1)
                result = Math.min(result, map.get(ch));
            else if(isValid(ch) == 2)
                result = Math.min(result, map.get(ch) / 2);
        }
        if(result == Integer.MAX_VALUE)
            return 0;
        return result;
    }
}
/*
class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<text.length();i++)
        {
            if(map.containsKey(text.charAt(i)))
                map.put(text.charAt(i),map.get(text.charAt(i))+1);
            else
                map.put(text.charAt(i),1);
        }
        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; 
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}
*/
