//Maximum Number of Words Found in Sentences
class Solution 
{
    public int mostWordsFound(String[] sentences) 
    {
        int result = 0;
        for(String str : sentences)
        {
            String[] arr = str.split(" ");
            if(arr.length > result)
                result = arr.length;
        }
        return result;
    }
}
