//Kth Distinct String in an Array
class Solution 
{
    public String kthDistinct(String[] arr, int k) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : arr)
        {
            if(map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for(String s : arr)
        {
            if(map.get(s) == 1)
                k--;
            if(k == 0)
                return s;
        }
        return "";
    }
}
