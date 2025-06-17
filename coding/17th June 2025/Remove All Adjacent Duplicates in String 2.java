//Remove All Adjacent Duplicates in String 2
class Solution 
{
    class Pair
    {
        char ch;
        int count;
        Pair(char ch, int count)
        {
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) 
    {
        Stack<Pair> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek().ch == ch)
                stack.peek().count++;
            else
                stack.push(new Pair(ch, 1));
            if(stack.peek().count == k)
                stack.pop();
        }
        String res = "";
        while(!stack.isEmpty())
        {
            Pair ele = stack.pop();
            for(int i = 0; i < ele.count; i++)
                res = ele.ch + res;
        }
        return res;
    }
}
