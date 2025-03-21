//Student Attendance Record 1
class Solution 
{
    public boolean checkRecord(String s) 
    {
        int a = 0, l = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'L')
                l++;
            else
            {
                l = 0;
                if(ch == 'A')
                    a++;
            }
            if(l == 3 || a >= 2)
                return false;
        }
        return true;
    }
}
