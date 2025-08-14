//Largest 3-Same-Digit Number in String
class Solution 
{
    public String largestGoodInteger(String num) 
    {
        String[] arr = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for(String str : arr)
            if(num.contains(str))
                return str;
        return "";
    }
}
