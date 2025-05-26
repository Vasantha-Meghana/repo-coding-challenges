//Merge Two 2D Arrays by Summing Values
class Solution 
{
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int[] ele : nums1)
        {
            if(map.containsKey(ele[0]))
                map.put(ele[0], map.get(ele[0]) + ele[1]);
            else
                map.put(ele[0], ele[1]);
        }
        for(int[] ele : nums2)
        {
            if(map.containsKey(ele[0]))
                map.put(ele[0], map.get(ele[0]) + ele[1]);
            else
                map.put(ele[0], ele[1]);
        }
        int[][] res = new int[map.size()][2];
        int i = 0;
        for(int k : map.keySet())
        {
            res[i][0] = k;
            res[i][1] = map.get(k);
            i++;
        }
        return res;
    }
}
