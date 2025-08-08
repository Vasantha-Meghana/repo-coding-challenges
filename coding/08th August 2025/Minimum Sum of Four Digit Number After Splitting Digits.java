// Minimum Sum of Four Digit Number After Splitting Digits
class Solution 
{
    public int minimumSum(int num) 
    {
        int[] arr = new int[4];
        int i = 0;
        while(num > 0)
        {
            arr[i] = num % 10;
            num = num / 10;
            i++;
        }
        Arrays.sort(arr);
        int first = arr[0] * 10 + arr[3];
        int last = arr[1] * 10 + arr[2];
        return first + last;
    }
}
