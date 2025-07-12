//Positions of Large Groups
class Solution 
{
    public List<List<Integer>> largeGroupPositions(String s) 
    {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int c = 1, i;
        for(i = 1; i < s.length(); i++)
        {
            if(s.charAt(i) == s.charAt(i - 1))
                c++;
            else
            {
                if(c >= 3)
                    result.add(new ArrayList<>(Arrays.asList(i - c, i - 1)));
                c = 1;
            }
        }
        if(c >= 3)
            result.add(new ArrayList<>(Arrays.asList(i - c, i - 1)));
        return result;
    }
}
