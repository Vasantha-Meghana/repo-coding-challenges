//Construct Smallest Number From DI String
class Solution 
{
    public String smallestNumber(String pattern) 
    {
        String result = "";
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) 
        {
            stack.push(i + 1);  
            if (i == pattern.length() || pattern.charAt(i) == 'I')
                while (!stack.isEmpty())
                    result += stack.pop();
        }
        return result;
    }
}
