//How Many Numbers Are Smaller Than the Current Number
class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] result = new int[nums.length];
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            temp[i] = nums[i];
        Arrays.sort(temp);
        for(int i = 0; i < nums.length; i++)
        {
            int j = 0;
            while(temp[j] != nums[i])
                j++;
            result[i] = j;
        }
        return result;
    }
}
