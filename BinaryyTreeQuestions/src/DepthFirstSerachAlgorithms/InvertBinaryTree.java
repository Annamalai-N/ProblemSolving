package DepthFirstSerachAlgorithms;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            retrurn null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;
        return root;
    }
}
