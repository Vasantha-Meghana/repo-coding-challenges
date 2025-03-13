//Add Strings
class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(l1 >= 0 || l2 >= 0 || carry != 0)
        {
            int a = 0, b = 0;
            if(l1 >= 0)
                a = num1.charAt(l1) - '0';
            if(l2 >= 0)
                b = num2.charAt(l2) - '0';
            int sum = a + b + carry;
            int digit = sum % 10;
            carry = sum / 10;
            res.append(digit);
            l1--;
            l2--;
        }
        return res.reverse().toString();
    }
}
