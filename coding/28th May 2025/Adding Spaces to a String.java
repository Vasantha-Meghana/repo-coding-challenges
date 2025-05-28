//Adding Spaces to a String
class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder res = new StringBuilder();
        int ind = 0;
        for(int i = 0; i < spaces.length; i++)
        {
            res.append(s, ind, spaces[i]);
            ind = spaces[i];
            res.append(" ");
        }
        res.append(s, spaces[spaces.length - 1], s.length());
        return res.toString();
    }
}
