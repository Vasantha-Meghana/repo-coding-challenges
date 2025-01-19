//Group Anagrams
class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String schars = new String(chars);
            if(!res.containsKey(schars))
                res.put(schars, new ArrayList<>());
            res.get(schars).add(s);
        }
        ArrayList result = new ArrayList<>(res.values());
        return result;
    }
}
