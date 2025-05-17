//Count the Number of Consistent Strings
class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int res = 0;
        for(String str : words)
        {
            int c = 0;
            for(char ch : str.toCharArray())
            {
                if(allowed.contains(ch + ""))
                    c++;
            }
            if(c == str.length())
                res++;
        }
        return res;
    }
}
