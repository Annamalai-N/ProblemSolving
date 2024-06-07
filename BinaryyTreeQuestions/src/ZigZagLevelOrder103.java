import javax.swing.tree.TreeNode;
import java.util.*;

public class ZigZagLevelOrder103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> k=new LinkedList<>();
        k.offer(root);
        boolean reverse=false;
        while(!k.isEmpty()){
            int levelSize=k.size();
            List<Integer> CurrentLevel=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if(!reverse){
                    //remove from front and add it in the back
                    TreeNode currentNode=k.pollFirst() ;
                    CurrentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        k.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        k.addLast(currentNode.right);
                    }
                }else{
                    //remove from back and it at the front
                    TreeNode currentNode=k.pollLast() ;
                    CurrentLevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        k.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        k.addFirst(currentNode.left);
                    }
                }

            }
            reverse=!reverse;
            res.add(CurrentLevel);
        }
        return res;
    }
}
