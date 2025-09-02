//Restore Finishing Order
class Solution 
{
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        int[] result = new int[friends.length];
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : friends)
            set.add(ele);
        for(int ele : order)
        {
            if(set.contains(ele))
            {
                result[i] = ele;
                i++;
            }
        }
        return result;
    }
}
