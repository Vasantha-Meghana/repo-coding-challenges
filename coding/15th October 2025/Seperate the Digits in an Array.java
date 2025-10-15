//Seperate the Digits in an Array
class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int ele : nums)
        {
            String s = Integer.toString(ele);
            for(int i = 0; i < s.length(); i++)
                res.add(s.charAt(i) - '0');
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
}
