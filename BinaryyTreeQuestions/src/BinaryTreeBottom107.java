import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeBottom107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            res.add(0,CurrentLevel);
        }
        return res;
    }
}
