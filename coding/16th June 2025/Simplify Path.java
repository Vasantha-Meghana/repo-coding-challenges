//Simplify Path
class Solution 
{
    public String simplifyPath(String path) 
    {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String str : arr)
        {
            if(str.equals("") || str.equals("."))
                continue;
            else if(str.equals(".."))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
                stack.push(str);
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty())
            res.insert(0, "/" + stack.pop());
        if(res.length() == 0)
            return "/";
        return res.toString();
    }
}
