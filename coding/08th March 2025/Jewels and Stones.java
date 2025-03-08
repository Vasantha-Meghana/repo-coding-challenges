//Jewels and Stones
class Solution 
{
    public int numJewelsInStones(String jewels, String stones) 
    {
        HashSet<Character> set = new HashSet<Character>();
        for(char ch : jewels.toCharArray())
            set.add(ch);
        int c = 0;
        for(char ch : stones.toCharArray())
            if(set.contains(ch))
                c++;
        return c;
    }
}
