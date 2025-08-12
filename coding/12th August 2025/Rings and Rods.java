//Rings and Rods
class Solution 
{
    public int countPoints(String rings) 
    {
        int result = 0;
        HashSet<Integer> setR = new HashSet<>();
        HashSet<Integer> setG = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for(int i = 0; i < rings.length(); i += 2)
        {
            int index = rings.charAt(i + 1) - '0';
            if(rings.charAt(i) == 'R')
                setR.add(index);
            else if(rings.charAt(i) == 'G')
                setG.add(index);
            else if(rings.charAt(i) == 'B')
                setB.add(index);
        }
        for(int i = 0; i <= 9; i++)
            if(setR.contains(i) && setG.contains(i) && setB.contains(i))
                result++;
        return result;
    }
}
