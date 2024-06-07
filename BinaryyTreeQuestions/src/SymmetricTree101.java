import javax.swing.tree.TreeNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode>k=new LinkedList<>();
        k.add(root.left);
        k.add(root.right);
        while(!k.isEmpty()){
            TreeNode left=k.poll();
            TreeNode right=k.poll();
            if(left==null && right==null){
                continue;
            }
            if (right == null || left==null) {
                return false;
            }
            if (right.val != left.val) {
                return false;
            }
            k.add(left.left);
            k.add(right.right);
            k.add(left.right);
            k.add(right.left);

        }
        return true;
    }
}
