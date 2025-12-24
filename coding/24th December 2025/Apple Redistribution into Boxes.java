//Apple Redistribution into Boxes
class Solution 
{
    public int minimumBoxes(int[] apple, int[] capacity) 
    {
        int total = 0;
        for(int ele : apple)
            total += ele;
        Arrays.sort(capacity);
        int result = 0;
        for(int i = capacity.length - 1; i >= 0; i--)
        {
            if(total <= 0)
                break;
            result++;
            total -= capacity[i];
        }
        return result;
    }
}
