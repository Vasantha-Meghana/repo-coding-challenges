//Goat Latin
class Solution 
{
    public String toGoatLatin(String sentence) 
    {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++)
        {
            char ch = arr[i].charAt(0);
            if(!set.contains(Character.toLowerCase(ch)))
                arr[i] = arr[i].substring(1, arr[i].length()) + ch;
            arr[i] += "ma";
            for(int j = 1; j <= i + 1; j++)
                arr[i] += "a";
        }
        return String.join(" ", arr);
    }
}
