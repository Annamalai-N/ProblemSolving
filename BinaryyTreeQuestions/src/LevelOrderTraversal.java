import javax.swing.tree.TreeNode;
import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> k=new LinkedList<>();
        k.offer(root);
        while(!k.isEmpty()){
            int levelSize=k.size();
            List<Integer> CurrentLevel=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode=k.poll() ;
                CurrentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    k.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    k.offer(currentNode.right);
                }

            }
            res.add(CurrentLevel);

        }


        return res;
    }


}
