//Time Needed to Buy Tickets
class Solution 
{
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        int sum = 0;
        for(int i = 0; i < tickets.length; i++)
        {
            int min = tickets[i];
            if(i <= k)
            {
                if(tickets[k] < min)
                    min = tickets[k];
                sum += min;
            }
            else 
            {
                if(tickets[k] - 1 < min)
                    min = tickets[k] - 1;
                sum += min;
            }
        }
        return sum;
    }
}
