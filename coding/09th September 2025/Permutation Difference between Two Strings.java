//Permutation Difference between Two Strings
class Solution 
{
    public int findPermutationDifference(String s, String t) 
    {
        int result = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int j = t.indexOf(s.charAt(i));
            result += Math.abs(i - j);
        }
        return result;
    }
}
