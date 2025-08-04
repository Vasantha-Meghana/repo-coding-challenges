//Group the people given the groupsize they belong to
class Solution 
{
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++)
        {
            int size = groupSizes[i];
            if(map.containsKey(size))
                map.get(size).add(i);
            else
            {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(size, list);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int key : map.keySet())
        {
            ArrayList<Integer> list = map.get(key);
            for(int i = 0; i < list.size(); i += key)
                result.add(list.subList(i, i + key));
        }
        return result;
    }
}
