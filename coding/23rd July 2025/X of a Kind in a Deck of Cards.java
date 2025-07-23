//X of a Kind in a Deck of Cards
class Solution 
{
    public int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    public boolean hasGroupsSizeX(int[] deck) 
    {
        if(deck.length == 1)   return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : deck)
        {
            if(map.containsKey(ele))
                map.put(ele, map.get(ele) + 1);
            else
                map.put(ele, 1);
        }
        int gcd = 0;
        for(int key : map.keySet())
        {
            gcd = gcd(gcd, map.get(key));
        }
        return gcd > 1;
    }
}
