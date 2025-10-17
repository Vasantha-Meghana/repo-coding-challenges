//String Matching in an Array
/*
class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 0; i < words.length - 1; i++)
        {
            for(int j = i + 1; j < words.length; j++)
            {
                if (words[i].contains(words[j]) && !res.contains(words[j]))
                    res.add(words[j]);
                else if (words[j].contains(words[i]) && !res.contains(words[i]))
                    res.add(words[i]);
            }
        }
        return res;
    }
}
*/

class Solution 
{
    public List<String> stringMatching(String[] words) 
    {
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words.length; j++)
            {
                if(i != j && words[j].contains(words[i]))
                {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
