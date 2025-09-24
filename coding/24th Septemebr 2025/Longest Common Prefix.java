//Longest Common Prefix
class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        String s1 = strs[0], s2 = strs[strs.length - 1];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s2.length(); i++)
        {
            if(i >= s1.length() || s1.charAt(i) != s2.charAt(i))
                break;    
            result.append(s1.charAt(i));
        }
        return result.toString();
    }
}
