//Removing Stars From a String
class Solution 
{
    public String removeStars(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray())
        {
            if(ch == '*')
                stack.pop();
            else
                stack.push(ch);
        }
        String res = "";
        while(!stack.isEmpty())
            res = stack.pop() + res;
        return res;
    }
}
