//Find the k-th Character in String Game 1
class Solution 
{
    public char kthCharacter(int k) 
    {
        StringBuilder str = new StringBuilder("a");
        while(str.length() < k)
        {
            int size = str.length();
            for(int i = 0; i < size; i++)
            {
                char ch = str.charAt(i);
                str.append((char) ('a' + ((ch - 'a') + 1) % 26));
            }
        }
        return str.charAt(k - 1);
    }
}
