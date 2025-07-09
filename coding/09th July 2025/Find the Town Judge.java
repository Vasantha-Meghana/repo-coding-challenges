//Find the Town Judge
class Solution 
{
    public int findJudge(int n, int[][] trust) 
    {
        if(n == 1)   return 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int[] ele : trust)
        {
            map.put(ele[0], -1);
            if(!map.containsKey(ele[1]) || map.get(ele[1]) != -1)
                map.put(ele[1], map.getOrDefault(ele[1], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == n - 1)
                return entry.getKey();
        }
        return -1;
    }
}
