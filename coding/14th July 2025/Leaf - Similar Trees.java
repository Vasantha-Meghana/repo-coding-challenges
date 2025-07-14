//Leaf - Similar Trees
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
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    public void find(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null)   return;
        if(root.left == null && root.right == null)
        {
            list.add(root.val);
            return;
        }
        find(root.right, list);
        find(root.left, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        find(root1, list1);
        find(root2, list2);
        return list1.equals(list2);
    }
}
