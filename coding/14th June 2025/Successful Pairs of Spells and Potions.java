//Successful Pairs of Spells and Potions
class Solution 
{
    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++)
        {
            int l = 0, r = potions.length - 1;
            while(l <= r)
            {
                int mid = (l + r) / 2;
                if((long)potions[mid] * spells[i] >= success)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            result[i] = potions.length - l;
        }
        return result;
    }
}
