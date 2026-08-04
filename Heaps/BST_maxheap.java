import java.util.ArrayList;
import java.util.List;
class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val =val;
        left=null;
        right=null;
    }
}
public class BST_maxheap {
     static int idx;
    public static void postorderFill(Node root, List<Integer> ans){
        if(root == null) return;
        
         postorderFill(root.left, ans);
        postorderFill(root.right, ans);
         root.val = ans.get(idx++);
    }
    
    public static void Inorder(Node root, List<Integer> ans){
        if(root == null) return;
        
        Inorder(root.left, ans);
        ans.add(root.val);
        Inorder(root.right, ans);
    }
    
    public static void convertToMaxHeapUtil(Node root) {
        List<Integer> ans = new ArrayList<>();
        Inorder(root, ans);
        idx = 0;
        postorderFill(root, ans);
    }
}