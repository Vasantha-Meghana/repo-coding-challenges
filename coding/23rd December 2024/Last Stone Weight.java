//Last Stone Weight
class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        List<Integer> arr =  new ArrayList<Integer>();
        for(int i = 0; i < stones.length; i++)
            arr.add(stones[i]);
        while(arr.size() > 1)
        {
            Collections.sort(arr);
            int n = arr.size();
            int ele1 = arr.remove(n - 2);
            int ele2 = arr.remove(n - 2);
            int diff = Math.abs(ele1 - ele2);
            if(diff != 0)
                arr.add(diff);
        }
        if(arr.size() != 0)
            return arr.get(0);
        return 0;
    }
}