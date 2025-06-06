//Validate Stack Sequences
class Solution 
{
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        int j = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int ele : pushed)
        {
            stack.push(ele);
            while(!stack.isEmpty() && popped[j] == stack.peek())
            {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
