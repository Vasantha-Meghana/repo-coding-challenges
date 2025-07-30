//Reverse Only Letters
class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        String[] array = s.split("[^a-zA-Z]+");
        String str = "";
        for(String st : array)
        {
            for(int i = 0; i < st.length(); i++)
                str = st.charAt(i) + str;
        }
        String result = "";
        int index = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                result += str.charAt(index);
                index++;
            }
            else
                result += s.charAt(i);
        }
        return result;
    }
}
