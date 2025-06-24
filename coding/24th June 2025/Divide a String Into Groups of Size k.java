//Divide a String Into Groups of Size k
class Solution 
{
    public String[] divideString(String s, int k, char fill) 
    {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < s.length() - (k - 1); i = i + k)
            arr.add(s.substring(i, i + k));
        int rem = s.length() % k;
        if(rem != 0)
        {
            String str = s.substring(s.length() - rem, s.length());
            while(str.length() != k)
                str += fill;
            arr.add(str);
        }
        String[] result = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            result[i] = arr.get(i);
        return result;
    }
}
