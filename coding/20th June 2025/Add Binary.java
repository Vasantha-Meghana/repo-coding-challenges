//Add Binary 
class Solution 
{
    public String addBinary(String a, String b) 
    {
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 || j >= 0|| carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            res.append(carry % 2);
            carry /= 2;
        }
        return res.reverse().toString();
    }
}
