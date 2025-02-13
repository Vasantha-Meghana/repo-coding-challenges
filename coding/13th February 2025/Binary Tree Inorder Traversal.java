//Binary Tree Inorder Traversal
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public void traverse(TreeNode temp, List<Integer> res)
    {
        if(temp == null) 
            return;
        traverse(temp.left, res);
        res.add(temp.val);
        traverse(temp.right, res);
    }
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        TreeNode temp = root;
        traverse(temp, res);
        return res;
    }
}
