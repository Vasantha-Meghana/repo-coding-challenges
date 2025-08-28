//Snake in Matrix
class Solution 
{
    public int finalPositionOfSnake(int n, List<String> commands) 
    {
        int result = 0;
        for(String str : commands)
        {
            if(str.equals("RIGHT"))
                result++;
            else if(str.equals("DOWN"))
                result += n;
            else if(str.equals("UP"))
                result -= n;
            else if(str.equals("LEFT"))
                result--;
        }
        return result;
    }
}
