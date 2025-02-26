//License Key Formatting
class Solution 
{
    public String licenseKeyFormatting(String s, int k) 
    {
        String temp = String.join("", s.split("-"));
        String res ="";
        int p = 0;
        for(int i = temp.length() - 1; i >= 0; i--)
        {
            p++;
            char ch = Character.toUpperCase(temp.charAt(i)); 
            if(p % k == 0 && i != 0)
                res = "-" + ch + res;
            else
                res = ch + res;
        }
        return res;
    }
}
