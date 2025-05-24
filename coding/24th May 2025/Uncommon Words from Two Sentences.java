//Uncommon Words from Two Sentences
class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        ArrayList<String> arr = new ArrayList<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr1)
        {
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for(String s : arr2)
        {
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for(String s : map.keySet())
        {
            if(map.get(s) == 1)
                arr.add(s);
        }
        String[] ans = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            ans[i] = arr.get(i);
        return ans;
    }
}
