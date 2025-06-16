//Remove K digits
class Solution 
{
    public String removeKdigits(String num, int k) 
    {
        Stack<Character> stack = new Stack<>();
        for(char digit : num.toCharArray())
        {
            while(!stack.isEmpty() && k > 0 && stack.peek() > digit)
            {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k > 0 && !stack.isEmpty())
        {
            stack.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
            str.append(stack.pop());
        str.reverse();
        while(str.length() > 0 && str.charAt(0) == '0')
            str.deleteCharAt(0);
        if(str.length() <= 0)
            return "0";
        return str.toString();
    }
}
