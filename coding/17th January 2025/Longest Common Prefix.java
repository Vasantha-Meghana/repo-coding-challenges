//Longest Common Prefix
class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);
        StringBuilder res = new StringBuilder();
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len = first.length();
        if(last.length() < len)
            len = last.length();
        for(int i = 0; i < len; i++)
        {
            if(first.charAt(i) != last.charAt(i))
                return res.toString();
            res.append(first.charAt(i));
        }
        return res.toString();
    }
}
/*
class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int n = strs.length;
        String res = "";
        String shortstr = strs[0];
        for(int i = 1; i < n; i++)
        {
            if(strs[i].length() < shortstr.length())
            {
                shortstr = strs[i];
            }
        }
        for(int k = 0; k < shortstr.length(); k++)
        {
            for(String s : strs)
            {
                if(s.charAt(k) != shortstr.charAt(k))
                    return res;    
            }
            res = res + shortstr.charAt(k);
        }
        return res;
    }
}
*/
