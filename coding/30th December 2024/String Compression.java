//String Compression
class Solution 
{
    public int compress(char[] chars) 
    {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < chars.length)
        {
            char curr = chars[i];
            int c = 0;
            while(i < chars.length && chars[i] == curr)
            {
                c++;
                i++;
            }
            res.append(curr);
            if(c > 1)
                res.append(c);
        }
        for(int j = 0; j < res.length(); j++)
            chars[j] = res.charAt(j);
        return res.length();
    }
}
