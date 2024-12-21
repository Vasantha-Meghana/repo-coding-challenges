//valid parantheses
class Solution 
{
    public boolean isValid(String s) 
    {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray())
        {
            if(ch == '{' || ch =='(' || ch == '[')
                map.put(ch, '.');
            else if(ch == ')')
                map.put('(', ch);
            else if(ch == '}')
                map.put('{', ch);
            else if(ch == ']')
                map.put('[', ch);
        }
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                stack.push(ch);
            else if(stack.size() == 0 || ch != map.get(stack.pop()))
                return false;
        }
        return stack.size() == 0;
    }
}