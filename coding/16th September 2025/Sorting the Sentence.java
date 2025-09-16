//Sorting the Sentence
class Solution 
{
    public String sortSentence(String s) 
    {
        String[] arr = s.split(" ");
        String[] temp = new String[arr.length];
        for(String str : arr)
        {
            int index = str.charAt(str.length() - 1) - '0';
            temp[index - 1] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", temp);
    }
}
