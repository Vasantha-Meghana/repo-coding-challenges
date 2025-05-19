//Find Common Characters
class Solution 
{
    public List<String> commonChars(String[] words) 
    {
        ArrayList<String> res = new ArrayList<String>();
        for(char c = 'a'; c <= 'z'; c++)
        {
            int minCount = Integer.MAX_VALUE;
            for(String s : words)
            {
                int count = 0;
                for(char ch : s.toCharArray())
                {
                    if(ch == c)
                        count++;
                }
                if(count < minCount)
                    minCount = count;
                if(minCount == 0)
                    break;
            }
            for(int i = 0; i < minCount; i++)
                res.add(String.valueOf(c));
        }
        return res;
    }
}
