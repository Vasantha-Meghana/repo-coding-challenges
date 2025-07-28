// Duplicate Zeros
class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
        int index = 0;
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length && index < arr.length; i++)
        {
            if(arr[i] == 0)
                index++;
            else
                arr1[index] = arr[i];
            index++;
        }
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr1[i];
    }
}
