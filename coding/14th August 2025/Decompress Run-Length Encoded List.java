//Decompress Run-Length Encoded List
class Solution 
{
    public int[] decompressRLElist(int[] nums) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2)
        {
            int ele = nums[i + 1];
            for(int j = 0; j < nums[i]; j++)
                arr.add(ele);
        }
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            result[i] = arr.get(i);
        return result;
    }
}
