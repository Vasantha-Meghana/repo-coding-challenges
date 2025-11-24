//Binary Prefix Divisible By 5
class Solution 
{
    public List<Boolean> prefixesDivBy5(int[] nums) 
    {
        ArrayList<Boolean> arr = new ArrayList<>();
        int num = 0;
        for(int ele : nums)
        {
            num = (num * 2 + ele) % 5;;
            arr.add(num == 0);
        }
        return arr;
    }
}
