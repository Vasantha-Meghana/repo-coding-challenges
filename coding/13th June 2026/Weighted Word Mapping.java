//Weighted Word Mapping
class Solution 
{
    public String mapWordWeights(String[] words, int[] weights) 
    {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < words.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < words[i].length(); j++)
                sum += weights[words[i].charAt(j) - 'a'];
            int r = sum % 26;
            str.append((char)('z' - r));
        }
        return str.toString();
    }
}
