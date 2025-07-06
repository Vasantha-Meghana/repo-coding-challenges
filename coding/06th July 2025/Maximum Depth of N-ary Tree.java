//Maximum Depth of N-ary Tree
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution 
{
    public int maxDepth(Node root) 
    {
        if(root == null)
            return 0;
        if(root.children.size() == 0)
            return 1;
        int max = Integer.MIN_VALUE;
        for(Node child : root.children)
        {
            int d = maxDepth(child) + 1;
            max = Math.max(max, d);
        }
        return max;
    }
}
