//Find X-Sum of all K-Long Subarrays
class Solution 
{
    public int[] findXSum(int[] nums, int k, int x) 
    {
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) 
        {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) 
            {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            List<int[]> freqList = new ArrayList<>();
            for (int key : map.keySet()) 
            {
                freqList.add(new int[]{key, map.get(key)});
            }
            int res = 0;
            for (int m = 0; m < x; m++) 
            {
                int maxVal = -1, maxFreq = -1, idx = -1;
                for (int t = 0; t < freqList.size(); t++) 
                {
                    int[] cur = freqList.get(t);
                    int key = cur[0], val = cur[1];
                    if (val > maxFreq || (val == maxFreq && key > maxVal)) 
                    {
                        maxFreq = val;
                        maxVal = key;
                        idx = t;
                    }
                }
                if (idx == -1) break;
                res += maxVal * maxFreq;
                freqList.remove(idx); 
            }
            result[i] = res;
        }
        return result;
    }
}
