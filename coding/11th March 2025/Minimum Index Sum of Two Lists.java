//Minimum Index Sum of Two Lists
class Solution 
{
    public String[] findRestaurant(String[] list1, String[] list2) 
    {
        ArrayList<String> arr = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++)
        {
            if(map.containsKey(list2[i]))
            {
                if(map.get(list2[i]) + i < min)
                {
                    min = map.get(list2[i]) + i;
                    arr.clear();
                    arr.add(list2[i]);
                }
                else if(map.get(list2[i]) + i == min)
                    arr.add(list2[i]);
            }
        }
        String[] ar = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            ar[i] = arr.get(i);
        return ar;
    }
}
