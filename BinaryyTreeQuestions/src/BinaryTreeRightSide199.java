public class BinaryTreeRightSide199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> k=new LinkedList<>();
        k.offer(root);
        while(!k.isEmpty()){
            int levelSize=k.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode=k.poll() ;
                if(i==levelSize-1){
                    res.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    k.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    k.offer(currentNode.right);
                }
            }
        }
        return res;
    }
}
