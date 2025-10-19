//Isomorphic Strings
class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        if(arr1.length != arr2.length)
            return false;
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        for(int i = 0; i < arr1.length; i++)
        {
            if(map1.containsKey(arr1[i]) && map1.get(arr1[i]) != arr2[i])
                return false;
            else
                map1.put(arr1[i], arr2[i]);
            if(map2.containsKey(arr2[i]) && map2.get(arr2[i]) != arr1[i])
                return false;
            else
                map2.put(arr2[i], arr1[i]);
        }
        return true;
    }
}
