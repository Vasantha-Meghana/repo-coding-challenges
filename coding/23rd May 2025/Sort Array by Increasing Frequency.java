//Sort Array by Increasing Frequency
class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (n1, n2) -> {
            if(map.get(n1) != map.get(n2))
                return map.get(n1) - map.get(n2);
            else
                return n2 - n1;
        });
        for(int i = 0; i < nums.length; i++)
            nums[i] = arr[i];
        return nums;
    }
}
