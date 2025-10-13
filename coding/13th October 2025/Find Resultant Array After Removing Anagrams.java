//Find Resultant Array After Removing Anagrams
class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        ArrayList<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for(String str : words)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(!stack.isEmpty() && stack.peek().equals(s))
                continue;
            else
            {
                result.add(str);
                stack.push(s);
            }
        }
        return result;
    }
}
