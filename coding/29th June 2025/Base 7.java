//Base 7
class Solution 
{
    public String convertToBase7(int num) 
    {
        if(num == 0)   return "0";
        String result = "";
        boolean flag = false;
        if(num < 0)
            flag = true;
        num = Math.abs(num);
        while(num > 0)
        {
            int r = num % 7;
            result = r + "" + result;
            num = num / 7;
        }
        if(flag) 
            result = "-" + result;
        return result;
    }
}
