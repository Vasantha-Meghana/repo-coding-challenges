//Partitioning Into Minimum Number of Deci-Binary Numbers
class Solution 
{
    public int minPartitions(String n) 
    {
        int result = Integer.MIN_VALUE;
        for(char ch : n.toCharArray())
        {
            int i = ch - '0';
            if(i > result)
                result = i;
        }
        return result;
    }
}
