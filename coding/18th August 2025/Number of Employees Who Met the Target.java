//Number of Employees Who Met the Target
class Solution 
{
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) 
    {
        int result = 0;
        for(int ele : hours)
        {
            if(ele >= target)
                result++;
        }
        return result;
    }
}
