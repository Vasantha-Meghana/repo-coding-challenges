//Valid Sudoku
class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<String> cols = new HashSet<String>();
        HashSet<String> rows = new HashSet<String>();
        HashSet<String> squares = new HashSet<String>();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] == '.')
                    continue;
                if(rows.contains(board[i][j] + "r" + i) || cols.contains(board[i][j] + "c" + j) || squares.contains(board[i][j] + "s" + i/3 + j/3 ))
                    return false;
                rows.add(board[i][j] + "r" + i);
                cols.add(board[i][j] + "c" + j);
                squares.add(board[i][j] + "s" + i/3 + j/3);
            }
        }
        return true;
    }
}
