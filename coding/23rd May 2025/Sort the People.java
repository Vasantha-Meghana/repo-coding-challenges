//Sort the People
class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for(int i = 0; i < names.length; i++)
            map.put(heights[i], names[i]);
        Arrays.sort(heights);
        for(int i = 0, j = heights.length - 1; i < names.length; i++, j--)
            names[i] = map.get(heights[j]);
        return names;
    }
}
