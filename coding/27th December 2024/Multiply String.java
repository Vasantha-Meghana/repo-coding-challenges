//Multiply String
class Solution 
{
    public char[] reverse(String str)
    {
        char[] arr = str.toCharArray();
        int s = 0, e = str.length() - 1;
        while(s < e)
        {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public String multiply(String num1, String num2) 
    {
        char[] s1 = reverse(num1);
        char[] s2 = reverse(num2);
        int[] ans = new int[s1.length + s2.length];
        for(int i = 0; i < s1.length; i++)
        {
            int carry = 0, start = i;
            for(int j = 0; j < s2.length; j++)
            {
                int d1 = s1[i] - '0';
                int d2 = s2[j] - '0';
                int sum = (d1 * d2) + ans[start] + carry;
                int base = sum % 10;
                carry = sum / 10;
                ans[start] = base;
                start++;
            }
            if(carry != 0)
            {
                ans[start] = carry;
            }
        }
        int i = ans.length - 1;
        while(i > 0 && ans[i] == 0)
            i--;
        String res = "";
        while(i >= 0)
        {
            res = res + ans[i];
            i--;
        }
        return res;
    }
}