//Find Kth Bit in Nth Binary String
class Solution 
{
    public char findKthBit(int n, int k) 
    {
        StringBuilder[] s = new StringBuilder[n];
        s[0] = new StringBuilder("0");
        for(int i = 1; i < n; i++)
        {
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < s[i - 1].length(); j++)
            {
                if(s[i - 1].charAt(j) == '0')
                    temp.append('1');
                else
                    temp.append('0');
            }
            s[i] = new StringBuilder();
            s[i].append(s[i - 1]);
            s[i].append("1");
            s[i].append(temp.reverse());
        }
        return s[n - 1].charAt(k - 1);
    }
}
