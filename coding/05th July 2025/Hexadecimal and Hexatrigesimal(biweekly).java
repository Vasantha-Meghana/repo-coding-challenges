//Hexadecimal and Hexatrigesimal
class Solution 
{
    public String concatHex36(int n) 
    {
        String hexad = "", hexat = "";
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n2 = n * n;
        int n3 = n * n * n;
        while(n2 > 0)
        {
            int r = n2 % 16;
            hexad = str.charAt(r) + hexad;
            n2 = n2 / 16;
        }
        while(n3 > 0)
        {
            int r = n3 % 36;
            hexat = str.charAt(r) + hexat;
            n3 = n3 / 36;
        }
        return hexad + hexat;
    }
}©leetcode
