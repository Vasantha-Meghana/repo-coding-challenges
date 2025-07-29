//Largest Number
class Solution 
{
    public String largestNumber(int[] nums) 
    {
        String[] array = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            array[i] = Integer.toString(nums[i]);
        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        if(array[0].equals("0"))
            return "0";
        String result = "";
        for(int i = 0; i < array.length; i++)
            result += array[i];
        return result;
    }
}
