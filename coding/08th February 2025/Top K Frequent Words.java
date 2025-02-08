//Top K Frequent Words
class Solution 
{
    public List<String> topKFrequent(String[] words, int k) 
    {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(String str : words)
        {
            if(map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int n : map.values())
            heap.add(n);
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 1; i <= k; i++)
        {
            int n = heap.poll();
            String str = "";
            for(String s : map.keySet())
                if(map.get(s) == n)
                {
                    str = s;
                    break;
                }
            map.remove(str);
            res.add(str);
        }
        return res;
    }
}
