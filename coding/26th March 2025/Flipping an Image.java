//Flipping an Image
class Solution 
{
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int[] row : image)
        {
            int left = 0, right = row.length - 1;
            while(left < right)
            {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            } 
            for(int i = 0; i < row.length; i++)
            {
                if(row[i] == 0)
                    row[i] = 1;
                else
                    row[i] = 0;
            }           
        }
        return image;
    }
}
