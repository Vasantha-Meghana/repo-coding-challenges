//Brick Wall
class Solution 
{
    public int leastBricks(List<List<Integer>> wall) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < wall.size(); i++)
        {
            int edge_pos = 0;
            for(int j = 0; j < wall.get(i).size() - 1; j++)
            {
                int len = wall.get(i).get(j);
                edge_pos = edge_pos + len;
                if(map.containsKey(edge_pos))
                    map.put(edge_pos, map.get(edge_pos) + 1);
                else
                    map.put(edge_pos, 1);
                if(map.get(edge_pos) > max)
                    max = map.get(edge_pos);
            }
        }
        return wall.size() - max;
    }
}
