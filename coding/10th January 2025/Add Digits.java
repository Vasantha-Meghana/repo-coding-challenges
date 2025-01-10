//Add Digits
class Solution 
{
    public int addDigits(int num) 
    { 
        int n1 = num;
        while(n1/10 != 0)
        {
            int new_num = 0;
            while(n1 != 0)
            {
                int r = n1 % 10;
                n1 = n1 / 10;
                new_num = new_num + r;
            }
            new_num = new_num + n1;
            n1 = new_num;
        }
        return n1;
    }
}
