//Keyboard Row
class Solution 
{
    public boolean check(String str, String c)
    {
        for(char ch : str.toCharArray())
        {
            ch = Character.toLowerCase(ch);
            if(c.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
    public String[] findWords(String[] words) 
    {
        ArrayList<String> res = new ArrayList<String>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(String str : words)
        {
            if(check(str, s1) || check(str, s2) || check(str, s3))
                res.add(str);
        }
        String[] result = new String[res.size()];
        for(int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
}
