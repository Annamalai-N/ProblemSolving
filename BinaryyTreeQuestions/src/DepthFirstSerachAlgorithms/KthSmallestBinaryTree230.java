package DepthFirstSerachAlgorithms;

import javax.swing.tree.TreeNode;

public class KthSmallestBinaryTree230 {
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        return kthSmallestHelper(root,k).val;
    }
    public TreeNode kthSmallestHelper(TreeNode root, int k) {

        if(root==null){
            return null;
        }
        //in order traversal
        TreeNode left=kthSmallestHelper(root.left, k);
        if (left != null) {
            return left;
        }
        count++;
        if(count==k){
            return root;
        }
        return kthSmallestHelper(root.right, k);
    }
}
