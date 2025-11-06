//Range Sum Query - Immutable
class NumArray 
{
    int[] prefix;
    int n;
    public NumArray(int[] nums) 
    {
        int n = nums.length - 1;
        prefix = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            prefix[i] = sum;
        }
    }
    public int sumRange(int left, int right) 
    {
        if((left == 0 && right == n) || left == 0) 
            return prefix[right];
        return prefix[right] - prefix[left - 1];
    }
}
/*
class NumArray 
{
    int[] nums;
    public NumArray(int[] nums) 
    {
        this.nums = nums;
    }
    public int sumRange(int left, int right) 
    {
        int sum = 0, l = left, r = right;
        while(l < r)
        {
            sum += nums[l];
            sum += nums[r];
            l++;
            r--;
        }
        if(l == r)
            sum += nums[l];
        return sum;
    }
}
*/

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
