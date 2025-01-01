//Maximum Number of Vowels in a Substring of given length
class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int count = 0;
        int[] vowels = new int[128];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;
        for(int i = 0; i < k; i++)
            count = count + vowels[s.charAt(i)];
        int maxVowels = count;
        for(int i = k; i < s.length(); i++)
        {
            count = count + vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
            if(count > maxVowels)
                maxVowels = count;
            if(maxVowels == k)
                return maxVowels;
        }
        return maxVowels;
    }
}
