import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderSuccessor {
    //Google question
    public TreeNode FindSucessor(TreeNode root,int key){
        if(root==null){
            return null;
        }
        Queue<TreeNode> k=new LinkedList<>();
        k.offer(root);
        while(!k.isEmpty()){
            TreeNode currentNode=k.poll() ;

            if (currentNode.left != null) {
                    k.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                    k.offer(currentNode.right);
            }
            if (currentNode == key) {
                break;
            }

        }
        return k.peek();
    }
}
