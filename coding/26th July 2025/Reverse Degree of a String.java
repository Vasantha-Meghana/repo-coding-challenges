//Reverse Degree of a String
class Solution 
{
    public int reverseDegree(String s) 
    {
        int[] arr = new int[26];
        int val = 1;
        for(int i = 25; i >= 0; i--)
        {
            arr[i] = val;
            val++;
        }
        int result = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int ch = (int)Character.toLowerCase(s.charAt(i));
            result += ((i + 1) * arr[ch - 97]);
        }
        return result;
    }
}
