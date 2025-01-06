//Unique Number ofOccurances
class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : arr)
        {
            if(map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }
        for(int v : map.values())
            set.add(v);
        return set.size() == map.size();
    }
}
