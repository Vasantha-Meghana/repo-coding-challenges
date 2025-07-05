//Find Lucky Integer in an Array
class Solution 
{
    public int findLucky(int[] arr) 
    {
        int result = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        for(int key : map.keySet())
        {
            if(key == map.get(key) && key > result)
                result = key;
        }
        return result;
    }
}
