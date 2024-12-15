//Reverse Words in a String |||
class Solution 
{
    public String reverseWords(String s) 
    {
        String[] arr = s.split(" ");
        String res = "";
        for(String str : arr)
        {
            String new_str = new StringBuilder(str).reverse().toString();
            res = res + new_str + " ";
        }
        res = res.substring(0, res.length() - 1);
        return res;
    }
}
        /*
        String t = "";
		String[] aos = s.split(" ");
        int l;
		for(int i = 0; i < aos.length; i++)
		{
            t = t + " ";
			l = aos[i].length();
			for(int j = l - 1; j >= 0; j--)
			{
				t = t + aos[i].charAt(j);
			}
		}
        t = t.substring(1,t.length());
        return t; 
        */