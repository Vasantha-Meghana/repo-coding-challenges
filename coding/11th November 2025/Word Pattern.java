//Word Pattern
class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
        char arr1[] = pattern.toCharArray();
        String arr2[] = s.split(" ");
        if(arr1.length != arr2.length)
            return false;
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();
        for(int i = 0; i < arr1.length; i++)
        {
            if(map1.containsKey(arr1[i]) && !(map1.get(arr1[i]).equals(arr2[i])))
                return false;
            else
                map1.put(arr1[i], arr2[i]);

            if(map2.containsKey(arr2[i]) && !(map2.get(arr2[i]).equals(arr1[i])))
                return false;
            else
                map2.put(arr2[i], arr1[i]);
        }
        return true;
    }
}
