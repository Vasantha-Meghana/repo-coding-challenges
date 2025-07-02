//Distribute Candies
class Solution 
{
    public int distributeCandies(int[] candyType) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : candyType)
            set.add(ele);
        int res = (int)candyType.length / 2;
        if(res > set.size())
            return set.size();
        return res;
    }
}
