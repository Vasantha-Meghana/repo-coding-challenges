//Relative Sort Array
class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        int[] res = new int[arr1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr1)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        int c = 0;
        for(int ele : arr2)
        {
            while(map.get(ele) > 0)
            {
                res[c] = ele;
                c++;
                map.put(ele, map.get(ele) - 1);
            }
            map.remove(ele);
        }
        int[] rem = new int[arr1.length - c];
        int i = 0;
        for(int ele : arr1)
        {
            if(map.containsKey(ele))
            {
                while(map.get(ele) > 0)
                {
                    rem[i] = ele;
                    i++;
                    map.put(ele, map.get(ele) - 1);
                }
                map.remove(ele);
            }
        }
        Arrays.sort(rem);
        for(int ele : rem)
        {
            res[c] = ele;
            c++;
        }
        return res;
    }
}
