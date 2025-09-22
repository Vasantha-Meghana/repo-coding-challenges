//Count Elements With Maximum Frequency
class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int result = 0;
        int max = Integer.MIN_VALUE;
        for(int ele : nums)
        {
            if(ele > max)
                max = ele;
        }
        int[] freq = new int[max];
        for(int i = 0; i < nums.length; i++)
            freq[nums[i] - 1] = freq[nums[i] - 1] + 1;
        int maxFreq = Integer.MIN_VALUE;
        for(int ele : freq)
        {
            if(ele > maxFreq)
                maxFreq = ele;
        }
        for(int ele : freq)
        {
            if(ele == maxFreq)
                result += ele;
        }
        return result;
    }
}
