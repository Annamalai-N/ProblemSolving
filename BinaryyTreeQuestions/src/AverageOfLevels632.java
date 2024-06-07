public class AverageOfLevels632 {
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

        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res=new ArrayList<>();
            if(root==null){
                return res;
            }
            Queue<TreeNode> k=new LinkedList<>();
            k.offer(root);
            while(!k.isEmpty()){
                int levelSize=k.size();
                Double avg=0.00;
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode=k.poll() ;
                    avg+=currentNode.val;
                    if (currentNode.left != null) {
                        k.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        k.offer(currentNode.right);
                    }
                }
                avg=avg/levelSize;
                res.add(avg);
            }
            return res;
        }

}
