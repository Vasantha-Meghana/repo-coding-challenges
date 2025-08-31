//Count Astrisks
class Solution 
{
    public int countAsterisks(String s) 
    {
        String[] arr = s.split("\\|");
        int result = 0;
        for(int i = 0; i < arr.length; i += 2)
        {
            for(char ch : arr[i].toCharArray())
                if(ch == '*')
                    result++;
        }
        return result;
    }
}
