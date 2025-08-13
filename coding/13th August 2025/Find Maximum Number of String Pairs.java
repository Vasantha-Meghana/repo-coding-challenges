//Find Maximum Number of String Pairs
class Solution 
{
    public int maximumNumberOfStringPairs(String[] words) 
    {
        int result = 0;
        for(int i = 0; i < words.length - 1; i++)
        {
            String str = new StringBuilder(words[i]).reverse().toString();
            for(int j = i + 1; j < words.length; j++)
            {
                if(str.equals(words[j]))
                    result++;
            }
        }
        return result;
    }
}
