//Clear Digits
class Solution 
{
    public String clearDigits(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!stack.isEmpty() && Character.isDigit(ch))
                stack.pop();
            else
                stack.push(ch);
        }
        String result = "";
        while(!stack.isEmpty())
            result = stack.pop() + result;
        return result;
    }
}
