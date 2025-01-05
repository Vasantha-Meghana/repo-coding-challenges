//Count Odd Numbers in an Interval Range
class Solution 
{
    public int countOdds(int low, int high) 
    {
        if(low % 2 != 0 && high % 2 == 0)
                high = high - 1;
        if(low % 2 == 0)
        {
            if(high % 2 != 0)
                low = low + 1;
            else
            {
                low = low + 1;
                high = high - 1;
            }
        }
        return ((high - low) / 2) + 1;
    }
}
