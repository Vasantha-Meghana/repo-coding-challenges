//Can Place Flowers
class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        for(int i = 0; i < flowerbed.length; i++)
        {
            boolean lflag = false, rflag = false;
            if(i == 0 || flowerbed[i - 1] == 0)
                lflag = true;
            if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0)
                rflag = true;
            if(lflag && rflag && flowerbed[i] == 0)
            {
                flowerbed[i] = 1;
                n--;
            }
            if(n <= 0)
                return true;
        }
        return false;
    }
}