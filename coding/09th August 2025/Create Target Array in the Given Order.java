// Create Target Array in the Given Order
class Solution 
{
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
            arr.add(index[i], nums[i]);
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
            result[i] = arr.get(i);
        return result;
    }
}
