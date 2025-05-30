//Minimum Number of Operations to Move All Balls to Each Box
class Solution 
{
    public int[] minOperations(String boxes) 
    {
        int[] res = new int[boxes.length()];
        ArrayList<Integer> c = new ArrayList<>();
        for(int i = 0; i < boxes.length(); i++)
        {
            if(boxes.charAt(i) == '1')
                c.add(i);
        }
        for(int i = 0; i < boxes.length(); i++)
        {
            int sum = 0;
            for(int j = 0; j < c.size(); j++)
                if(i != c.get(j))
                    sum += Math.abs(c.get(j) - i);
            res[i] = sum;
        }
        return res;
    }
}
