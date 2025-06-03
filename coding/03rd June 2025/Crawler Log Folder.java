//Crawler Log Folder
class Solution 
{
    public int minOperations(String[] logs) 
    {
        Stack<String> stack = new Stack<String>();
        for(String str : logs)
        {
            if(str.equals("../"))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(!str.equals("./"))
                stack.push(str);
        }
        return stack.size();
    }
}
