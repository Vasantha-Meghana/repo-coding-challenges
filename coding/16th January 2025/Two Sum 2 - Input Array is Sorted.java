//Two Sum 2 - Input Array is Sorted
class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int[] res = new int[2];
        int n = numbers.length;
        int i = 0,j = n - 1;
        while(i <= n - 1 && j >= 0)
        {
            if(numbers[i] + numbers[j] > target)
                j--;
            else if(numbers[i] + numbers[j] < target)
                i++;
            else
            {
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
        }
        return res;
    }
}
