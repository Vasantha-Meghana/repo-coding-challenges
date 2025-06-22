//Water Bottles
class Solution 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int res = numBottles;
        while(numBottles >= numExchange)
        {
            int temp = numBottles / numExchange;
            res += temp;
            numBottles = temp + (numBottles % numExchange);
        } 
        return res;   
    }
}
