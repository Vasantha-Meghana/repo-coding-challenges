//Excel Sheet Column Title
class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        HashMap<Integer,Character> map = new HashMap<>();
        int i = 1;
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            map.put(i, ch);
            i++;
        }
        if(columnNumber <= 26)
            return map.get(columnNumber) + "";
        String res = "";
        while(columnNumber > 0)
        {
            columnNumber--;
            int r = columnNumber % 26;
            res = map.get(r + 1) + res;
            columnNumber /= 26;
        }
        return res;
    }
}
