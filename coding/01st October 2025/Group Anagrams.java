//Group Anagrams
class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String st = new String(arr);
            if(!map.containsKey(st))
                map.put(st, new ArrayList<>());
            map.get(st).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(String key : map.keySet())
            result.add(map.get(key));
        return result;
    }
}
