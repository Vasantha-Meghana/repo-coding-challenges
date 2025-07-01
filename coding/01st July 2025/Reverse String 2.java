//Reverse String 2
class Solution 
{
    public void reverse(char[] arr, int l, int r)
    {
        while(l < r)
        {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public String reverseStr(String s, int k) 
    {
        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i = i + (2 * k))
        {
            int l = i, r = i + k - 1;
            if(s.length() < i + k)
                r = s.length() - 1;
            reverse(array, l, r);
        }
        return new String(array);
    }
}
