//Replace All Digits with Characters
class Solution 
{
    public String replaceDigits(String s) 
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length() - 1; i += 2)
        {
            char ch = sb.charAt(i);
            ch += (sb.charAt(i + 1) - '0');
            sb.setCharAt(i + 1, ch);
        }
        return sb.toString();
    }
}
