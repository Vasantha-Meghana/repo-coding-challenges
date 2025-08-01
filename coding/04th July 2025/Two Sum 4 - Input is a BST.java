//Two Sum 4 - Input is a BST
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
    public boolean inorder(TreeNode node, int k, Set<Integer> set)
    {
        if(node == null)
            return false;
        if(set.contains(k - node.val))
            return true;
        set.add(node.val);
        return inorder(node.left, k, set) || inorder(node.right, k, set);
    }
    public boolean findTarget(TreeNode root, int k) 
    {
        Set<Integer> set = new HashSet<>();
        return inorder(root, k, set);
    }
}
