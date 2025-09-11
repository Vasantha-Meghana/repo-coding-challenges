//Sort Vowels in a String
class Solution 
{
    public String sortVowels(String s) 
    {
        String str = "AEIOUaeiou";
        ArrayList<Character> arr = new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            if(str.contains(ch + ""))
                arr.add(ch);
        }
        Collections.sort(arr);
        int i = 0;
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(str.contains(ch + ""))
            {
                res.append(arr.get(i));
                i++;
            }
            else
                res.append(ch);
        }
        return res.toString();
    }
}
