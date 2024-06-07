public class DiameterOfBinaryTree543 {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {

        HeightOf(root);
        return diameter-1;
    }

    int HeightOf(TreeNode node) {
        if(node==null){
            return 0;
        }
        int leftHeight=HeightOf(node.left);
        int rightHeight=HeightOf(node.right);
        int dia=leftHeight+rightHeight+1;
        diameter=Math.max(diameter,dia);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
