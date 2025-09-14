//Convert Date to Binary
class Solution 
{
    public String convertDateToBinary(String date) 
    {
        String[] arr = date.split("-");
        for(int i = 0; i < arr.length; i++)
        {
            int val = Integer.valueOf(arr[i]);
            String str = Integer.toBinaryString(val);
            arr[i] = str;
        }
        return String.join("-", arr);
    }
}
