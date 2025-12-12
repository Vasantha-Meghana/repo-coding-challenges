//Destination City
class Solution 
{
    public String destCity(List<List<String>> paths) 
    {
        String res = paths.get(0).get(0);
        HashMap<String, String> hmap = new HashMap<String, String>();
        for(List<String> l : paths)
            hmap.put(l.get(0), l.get(1));
        while(hmap.containsKey(res))
            res = hmap.get(res);
        return res;
    }
}
