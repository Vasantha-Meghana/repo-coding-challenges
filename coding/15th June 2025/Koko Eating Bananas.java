//Koko Eating Bananas
class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int min = 1, max = Integer.MIN_VALUE;
        for(int ele : piles)
            if(ele > max)
                max = ele;
        int ans = max;
        while(min <= max)
        {
            int mid = min + (max - min) / 2;
            long temp = 0;
            for(int ele : piles)
                temp += (ele + mid - 1) / mid;
            if(temp <= h)
            {
                ans = mid;
                max = mid - 1;
            }
            else
                min = mid + 1;
        }
        return ans;
    }
}
