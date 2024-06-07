package DepthFirstSerachAlgorithms;

public class ValidBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        return Helper(root,null,null);
    }

    private boolean Helper(TreeNode node, Integer low, Integer high) {
        if(node==null){
            return true;
        }
        if(low!=null && node.val<=low){
            return false;
        }
        if(high!=null&&node.val>=high){
            return false;
        }
        boolean leftTree=Helper(node.left,low,node.val);
        boolean rightTree=Helper(node.right,node.val,high);
        return leftTree && rightTree;
    }
}
