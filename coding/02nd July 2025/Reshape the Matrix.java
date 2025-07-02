//Reshape the Matrix
class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        if(mat.length * mat[0].length != r * c)
            return mat;
        int[][] result = new int[r][c];
        int ri = 0, ci = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                result[ri][ci] = mat[i][j];
                ci++;
                if(ci == c)
                {
                    ci = 0;
                    ri++;
                }
            }
        }
        return result;
    }
}
