//Binary Tree Paths
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
    public void search(TreeNode root, String path, List<String> res)
    {
        if(root.left == null && root.right == null)  
            res.add(path + root.val);
        if(root.left != null)
            search(root.left, path + root.val + "->", res);
        if(root.right != null)
            search(root.right, path + root.val + "->", res);
    }
    public List<String> binaryTreePaths(TreeNode root) 
    {
        ArrayList<String> res = new ArrayList<>();
        if(root != null)
            search(root, "", res);
        return res;
    }
}
