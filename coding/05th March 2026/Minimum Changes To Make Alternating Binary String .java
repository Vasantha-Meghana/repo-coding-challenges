//Minimum Changes To Make Alternating Binary String 
class Solution 
{
    public int minOperations(String s) 
    {
        int count1 = 0,count2 = 0;
        char[] arr = s.toCharArray();
        char[] alt1 = new char[arr.length];
        char[] alt2 = new char[arr.length];
        for(int i1 = 0; i1 < arr.length; i1++)
        {
            if(i1 % 2 == 0)
            {
                alt1[i1] = '0';
                alt2[i1] = '1';
            }
            else
            {
                alt1[i1] = '1';
                alt2[i1] = '0';
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != alt1[i])
                count1++;
            else if(arr[i] != alt2[i])
                count2++;
        }
        return Math.min(count1, count2);
    }
}
