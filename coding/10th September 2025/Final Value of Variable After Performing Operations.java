//Final Value of Variable After Performing Operations
class Solution 
{
    public int finalValueAfterOperations(String[] operations) 
    {
        int result = 0;
        for(String str : operations)
        {
            if(str.equals("X++") || str.equals("++X"))
                result++;
            else if(str.equals("X--") || str.equals("--X"))
                result--;
        }
        return result;
    }
}
