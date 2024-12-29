//Set Matrix Zeroes
class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right  = matrix[0].length - 1;
        int[][] matrix2 = new int[bottom + 1][right + 1];
        for(int i = top; i <= bottom; i++)
            for(int j = left; j <= right; j++)
                matrix2[i][j] = matrix[i][j];

        for(int i = top; i <= bottom; i++)
        {
            for(int j = left; j <= right; j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int k = 1; i - k >= top; k++)
                        matrix2[i - k][j] = 0;
                    for(int k = 1; i + k <= bottom; k++)
                        matrix2[i + k][j] = 0;
                    for(int k = 1; j - k >= left; k++)
                        matrix2[i][j - k] = 0;
                    for(int k = 1; j + k <= right; k++)
                        matrix2[i][j + k] = 0;
                }
            }
        }

        for(int i = top; i <= bottom; i++)
            for(int j = left; j <= right; j++)
                matrix[i][j] = matrix2[i][j];
    }
}