//Asteroid Collision
class Solution 
{
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        for(int ele : asteroids)
        {
            if(ele > 0)
                stack.push(ele);
            else
            {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek()< -ele)
                    stack.pop();
                if(stack.isEmpty() || stack.peek() < 0)
                    stack.push(ele);
                if(stack.peek() == -ele)
                    stack.pop();
            }
                
        }
        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty())
        {
            res[i] = stack.pop();
            i--;
        }
        return res;
    }
}
