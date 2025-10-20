//Cells in a Range on an Excel Sheet
class Solution 
{
    public List<String> cellsInRange(String s) 
    {
        ArrayList<String> result = new ArrayList<>();
        for(char ch = s.charAt(0); ch <= s.charAt(3); ch++)
        {
            for(int i = s.charAt(1) - '0'; i <= s.charAt(4) - '0'; i++)
            {
                result.add(ch + "" + i);
            }
        }
        return result;
    }
}
