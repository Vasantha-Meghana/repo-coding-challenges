//Final Prices With a Special Discount in a Shop
class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = prices.length - 1; i >= 0; i--)
        {
            while(!stack.isEmpty() && stack.peek() > prices[i])
                stack.pop();
            int ele = prices[i];
            if(!stack.isEmpty())
                prices[i] -= stack.peek();
            stack.push(ele);
        }
        return prices;
    }
}
