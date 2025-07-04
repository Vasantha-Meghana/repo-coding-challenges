//Robot Return to Origin
class Solution 
{
    public boolean judgeCircle(String moves) 
    {
        int i = 0, j = 0;
        for(char ch : moves.toCharArray())
        {
            switch(ch)
            {
                case 'R':
                    j++;
                    break;
                case 'L':
                    j--;
                    break;
                case 'U':
                    i--;
                    break;
                case 'D':
                    i++;
                    break;
            }
        }
        return i == 0 && j == 0;
    }
}
