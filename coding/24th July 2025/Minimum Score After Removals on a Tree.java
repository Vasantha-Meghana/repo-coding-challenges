//Minimum Score After Removals on a Tree
class Solution 
{
    int[] subtree;
    Set<Integer>[] descendants;
    List<Integer>[] graph;
    void dfs(int node, int parent, int[] nums)
    {
        subtree[node] = nums[node];
        descendants[node].add(node);
        for(int neighbour : graph[node])
        {
            if(neighbour != parent)
            {
                dfs(neighbour, node, nums);
                subtree[node] ^= subtree[neighbour];
                descendants[node].addAll(descendants[neighbour]);
            }
        }
    }
    public int minimumScore(int[] nums, int[][] edges) 
    {
        graph = new ArrayList[nums.length];
        for(int i = 0; i < nums.length; i++)
            graph[i] = new ArrayList<>();
        for(int[] edge : edges)
        {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        subtree = new int[nums.length];
        descendants = new HashSet[nums.length];
        for(int i = 0; i < nums.length; i++)
            descendants[i] = new HashSet<>();
        dfs(0, -1, nums);
        int total = subtree[0];
        int minScore = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                int xi = subtree[i];
                int xj = subtree[j];
                int val1, val2, val3;
                if(descendants[i].contains(j))
                {
                    val1 = xj;
                    val2 = xi ^ xj;
                    val3 = total ^ xi;
                }
                else if(descendants[j].contains(i))
                {
                    val1 = xi;
                    val2 = xj ^ xi;
                    val3 = total ^ xj;
                }
                else
                {
                    val1 = xi;
                    val2 = xj;
                    val3 = total ^ xi ^ xj;
                }
                int max = Math.max(val1, Math.max(val2, val3));
                int min = Math.min(val1, Math.min(val2, val3));
                minScore = Math.min(minScore, max - min);
            }
        }
        return minScore;
    }
}
