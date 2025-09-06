//Count Items Matching a Rule
class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int j = -1;
        if(ruleKey.equals("type"))
            j = 0;
        else if(ruleKey.equals("color"))
            j = 1;
        else if(ruleKey.equals("name"))
            j = 2;
        int result = 0;
        for(List<String> list : items)
        {
            if(list.get(j).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
