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


class Solution {
    private int numOfGoodNodes = 0;

    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        helper(root, root.val);
        return numOfGoodNodes;
    }

    public void helper(TreeNode root, int highestEncountered) {
        if (root == null) return;

        if (root.val >= highestEncountered) numOfGoodNodes++;

        highestEncountered = Math.max(root.val, highestEncountered);

        helper(root.left, highestEncountered); helper(root.right, highestEncountered);
    }
}
