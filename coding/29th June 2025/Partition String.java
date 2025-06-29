//Partition String
class Solution 
{
    public List<String> partitionString(String s) 
    {
        int i = 0;
        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        while(i < s.length())
        {
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            for(int j = i; j < s.length(); j++)
            {
                sb.append(s.charAt(j));
                if(!set.contains(sb.toString()))
                {
                    set.add(sb.toString());
                    list.add(sb.toString());
                    i = j + 1;
                    flag = true;
                    break;
                }
            }
            if(!flag)
                break;
        }
        return list;
    }
}©leetcode
