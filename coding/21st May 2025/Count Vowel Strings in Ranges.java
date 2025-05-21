//Count Vowel Strings in Ranges
class Solution 
{
    public int[] vowelStrings(String[] words, int[][] queries) 
    {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int prefix[] = new int[words.length + 1];
        int res[] = new int[queries.length];
        for(int i = 0; i < words.length; i++)
        {
            if(set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length() - 1)))
                prefix[i + 1] = prefix[i] + 1;
            else
                prefix[i + 1] = prefix[i];
        }
        for(int i = 0; i < queries.length; i++)
        {
            int l = queries[i][0], r = queries[i][1];
            res[i] = prefix[r + 1] - prefix[l];
        }
        return res;
    }
}
