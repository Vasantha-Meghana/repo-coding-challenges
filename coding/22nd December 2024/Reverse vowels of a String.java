//Reverse vowels of a String
class Solution 
{
    public boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||ch == 'i' ||ch == 'I' ||ch == 'o' ||ch == 'O' || ch == 'u' || ch == 'U';
    }
    public String reverseVowels(String s) 
    {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j)
        {
            while(i < j && !isVowel(arr[i]))
                i++;
            while(i < j && !isVowel(arr[j]))
                j--;
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }
}