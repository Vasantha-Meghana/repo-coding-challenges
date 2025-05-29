//Average Waiting Time
class Solution 
{
    public double averageWaitingTime(int[][] customers) 
    {
        double sum = 0;
        int curr = 0;
        for(int[] ele : customers)
        {
            int arrival = ele[0];
            int service = ele[1];
            if(curr < arrival)
                curr = arrival;
            int waiting = curr - arrival + service;
            sum += waiting;
            curr += service;
        }
        return sum / customers.length;
    }
}
