//Remove Sub-Folders from the Filesystem
class Solution 
{
    public List<String> removeSubfolders(String[] folder) 
    {
        Arrays.sort(folder);
        ArrayList<String> result = new ArrayList<String>();
        HashSet<String> set = new HashSet<>();
        for(String ele : folder)
            set.add(ele);
        for(String ele : folder)
        {
            result.add(ele);
            for(int i = 0; i < ele.length(); i++)
                if(ele.charAt(i) == '/' && set.contains(ele.substring(0, i)))
                {
                    result.remove(result.size() - 1);
                    break;
                }
        }
        return result;
    }
}
