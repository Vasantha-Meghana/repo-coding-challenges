//Daily Temperatures
class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int res[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
            {
                int prevind = stack.pop();
                res[prevind] = i - prevind;
            }
            stack.push(i);
        }
        return res;
    }
}
