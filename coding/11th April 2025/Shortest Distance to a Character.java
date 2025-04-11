//Shortest Distance to a Character
class Solution 
{
    public int[] shortestToChar(String s, char c) 
    {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == c)
                arr.add(i);
        int[] ans = new int[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < arr.size(); j++)
            {
                if(Math.abs(i - arr.get(j)) < min)
                    min = Math.abs(i - arr.get(j));
            }
            ans[i] = min;
        }
        return ans;
    }
}
