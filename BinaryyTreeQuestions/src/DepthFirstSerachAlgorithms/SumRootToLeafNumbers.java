package DepthFirstSerachAlgorithms;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return Helper(root,0);
    }

    private int Helper(TreeNode root, int i) {
        if(root==null){
            return 0;
        }
        i=i*10+root.val;
        if (root.right == null && root.left==null) {
            return  i;
        }
        return Helper(root.left,i)+Helper(root.right,i);
    }
}
